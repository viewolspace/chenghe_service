package com.chenghe.parttime.service;

import com.chenghe.parttime.base.ContextLoader;
import com.chenghe.parttime.wx.config.WxMaConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WxConfigurationTest {



    @Test
    public void getConfigure(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ContextLoader.class);
        WxMaConfiguration configuration = ctx.getBean(WxMaConfiguration.class);
        System.out.println(configuration);
    }


}
