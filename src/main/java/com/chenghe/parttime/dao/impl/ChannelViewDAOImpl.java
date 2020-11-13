package com.chenghe.parttime.dao.impl;

import com.chenghe.parttime.dao.BaseDAO;
import com.chenghe.parttime.dao.IChannelViewDAO;
import com.chenghe.parttime.pojo.ChannelView;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lenovo on 2020/6/30.
 */
@Repository("channelViewDAO")
public class ChannelViewDAOImpl extends BaseDAO<ChannelView> implements IChannelViewDAO {

    @Override
    public int addChannelView(ChannelView channelView) {
        return super.insert(channelView);
    }

    @Override
    public ChannelView getChannelView(int id) {
        return super.get(id);
    }

    @Override
    public int updateChannelView(ChannelView channelView) {
        return super.updateBy("updateData",channelView);
    }


    @Override
    public int delChannelView(int id) {
        return super.delete(id);
    }

    @Override
    public List<ChannelView> list() {
        return super.findBy("list",null);
    }
}
