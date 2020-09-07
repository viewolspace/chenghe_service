package com.chenghe.parttime.service.impl;

import com.chenghe.parttime.dao.IChannelViewDAO;
import com.chenghe.parttime.pojo.ChannelView;
import com.chenghe.parttime.service.IChannelViewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2020/6/30.
 */
@Service("channelViewService")
public class ChannelViewServiceImpl implements IChannelViewService {

    @Resource
    private IChannelViewDAO channelViewDAO;

    @Override
    public ChannelView getChannelView() {
        return channelViewDAO.getChannelView();
    }

    @Override
    public int updateChannelView(ChannelView channelView) {
        return channelViewDAO.updateChannelView(channelView);
    }
}
