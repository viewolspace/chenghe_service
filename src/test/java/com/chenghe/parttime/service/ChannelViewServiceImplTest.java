package com.chenghe.parttime.service;

import com.chenghe.parttime.base.BaseTestClass;
import com.chenghe.parttime.pojo.ChannelView;
import org.junit.Test;

/**
 * Created by lenovo on 2018/6/28.
 */
public class ChannelViewServiceImplTest extends BaseTestClass {

    private IChannelViewService service = (IChannelViewService) getInstance("channelViewService");



    @Test
    public void get() {
        ChannelView channelView = service.getChannelView();
        System.out.println(service.getChannelView());

        channelView.setAppIds("1,2");

        service.updateChannelView(channelView);
        System.out.println(service.getChannelView());


    }
}
