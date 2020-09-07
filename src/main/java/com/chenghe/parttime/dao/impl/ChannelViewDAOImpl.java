package com.chenghe.parttime.dao.impl;

import com.chenghe.parttime.dao.BaseDAO;
import com.chenghe.parttime.dao.IChannelViewDAO;
import com.chenghe.parttime.pojo.ChannelView;
import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 2020/6/30.
 */
@Repository("channelViewDAO")
public class ChannelViewDAOImpl extends BaseDAO<ChannelView> implements IChannelViewDAO {

    @Override
    public ChannelView getChannelView() {
        return super.findUniqueBy("selectData",null);
    }

    @Override
    public int updateChannelView(ChannelView channelView) {
        return super.updateBy("updateData",channelView);
    }
}
