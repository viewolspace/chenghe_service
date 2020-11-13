package com.chenghe.parttime.service;

import com.chenghe.parttime.pojo.ChannelView;

/**
 * Created by lenovo on 2020/6/30.
 */
public interface IChannelViewService {

    int addChannelView(ChannelView channelView);

    ChannelView getChannelView(int id);

    int updateChannelView(ChannelView channelView);

    int delChannelView(int id);

    boolean isView(String appId,String version, String channel);
}
