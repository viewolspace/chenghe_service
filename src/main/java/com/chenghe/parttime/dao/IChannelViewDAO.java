package com.chenghe.parttime.dao;

import com.chenghe.parttime.pojo.ChannelView;

import java.util.List;

/**
 * Created by lenovo on 2020/6/30.
 */
public interface IChannelViewDAO {

    int addChannelView(ChannelView channelView);

    ChannelView getChannelView(int id);

    int updateChannelView(ChannelView channelView);

    int delChannelView(int id);

    List<ChannelView> list();

}
