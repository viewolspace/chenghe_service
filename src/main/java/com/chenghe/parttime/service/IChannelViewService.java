package com.chenghe.parttime.service;

import com.chenghe.parttime.pojo.ChannelView;

/**
 * Created by lenovo on 2020/6/30.
 */
public interface IChannelViewService {

    ChannelView getChannelView();

    int updateChannelView(ChannelView channelView);
}
