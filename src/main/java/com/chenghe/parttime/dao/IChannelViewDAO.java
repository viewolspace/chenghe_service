package com.chenghe.parttime.dao;

import com.chenghe.parttime.pojo.ChannelView;

/**
 * Created by lenovo on 2020/6/30.
 */
public interface IChannelViewDAO {
    ChannelView getChannelView();

    int updateChannelView(ChannelView channelView);
}
