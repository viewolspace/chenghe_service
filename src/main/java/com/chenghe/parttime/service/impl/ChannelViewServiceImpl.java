package com.chenghe.parttime.service.impl;

import com.chenghe.parttime.dao.IChannelViewDAO;
import com.chenghe.parttime.pojo.ChannelView;
import com.chenghe.parttime.service.IChannelViewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by lenovo on 2020/6/30.
 */
@Service("channelViewService")
public class ChannelViewServiceImpl implements IChannelViewService {

    // key appid , key2 version  value channel
    private Map<String, Map<String, Set<String>>> map = new HashMap<>();

    private long lastLoad = 0;

    @Resource
    private IChannelViewDAO channelViewDAO;

    @Override
    public ChannelView getChannelView(int id) {
        return channelViewDAO.getChannelView(id);
    }

    @Override
    public int updateChannelView(ChannelView channelView) {
        return channelViewDAO.updateChannelView(channelView);
    }

    @Override
    public int addChannelView(ChannelView channelView) {
        return channelViewDAO.addChannelView(channelView);
    }

    @Override
    public int delChannelView(int id) {
        return channelViewDAO.delChannelView(id);
    }

    private void loadData() {
        List<ChannelView> list = channelViewDAO.list();
        Map<String, Map<String, Set<String>>> temp = new HashMap<>();
        for (ChannelView channelView : list) {
            String appId = channelView.getAppId();
            String version = channelView.getVersion();
            String channel = channelView.getChannel();
            Map<String, Set<String>> versions = temp.get(appId);
            if(versions==null){
                versions = new HashMap<>();
                temp.put(appId,versions);
            }

            Set<String> channels = versions.get(version);
            if(channels==null){
                channels = new HashSet<>();
                versions.put(version,channels);
            }
            channels.add(channel.toLowerCase());

        }

        this.map = temp;

        lastLoad = System.currentTimeMillis();
    }


    @Override
    public boolean isView(String appId, String version, String channel) {
        if (lastLoad == 0 || System.currentTimeMillis() - lastLoad > 2 * 60 * 1000) {
            this.loadData();
        }

        Map<String, Map<String, Set<String>>> tempMap = this.map;


        Map<String, Set<String>> appIds = tempMap.get(appId);

        if(appIds!=null){//可能有审核
            Set<String> channels = appIds.get(version);
            if(channels!=null){//可能审核
                if(channels.contains("all") || channels.contains(channel.toLowerCase())){
                    return true;
                }
            }
        }
        return false;
    }
}
