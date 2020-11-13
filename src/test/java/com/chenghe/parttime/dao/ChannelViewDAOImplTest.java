package com.chenghe.parttime.dao;

import com.chenghe.parttime.base.BaseTestClass;
import com.chenghe.parttime.pojo.ChannelView;
import org.junit.Test;

/**
 * Created by lenovo on 2018/6/28.
 */
public class ChannelViewDAOImplTest extends BaseTestClass {

    private IChannelViewDAO dao = (IChannelViewDAO)getInstance("channelViewDAO");

    private ChannelView getChannelView(){
        ChannelView channelView = new ChannelView();
        channelView.setAppId("1");
        channelView.setChannel("vivo");
        channelView.setType(1);
        channelView.setVersion("1.0.0");
        return channelView;
    }

    @Test
    public void addChannelView(){

        System.out.println(dao.addChannelView(getChannelView()));
    }

    @Test
    public void getChannelViewTest(){
        System.out.println(dao.getChannelView(1));
    }

    @Test
    public void updateChannelView(){
        ChannelView channelView = this.getChannelView();
        channelView.setVersion("1.1.1");
        channelView.setChannel("oppo");
        channelView.setAppId("2");
        channelView.setId(1);
        dao.updateChannelView(channelView);
    }

    @Test
    public void delChannelView(){
        dao.delChannelView(1);
    }

    @Test
    public void list(){
        System.out.println(dao.list());
    }
}
