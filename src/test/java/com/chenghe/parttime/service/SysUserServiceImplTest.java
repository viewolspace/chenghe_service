package com.chenghe.parttime.service;

import com.chenghe.parttime.base.BaseTestClass;
import org.junit.Test;

/**
 * Created by lenovo on 2018/6/28.
 */
public class SysUserServiceImplTest extends BaseTestClass {

    private ISysUserService service = (ISysUserService) getInstance("sysUserService");



    @Test
    public void selectAll() {
        System.out.println(service.selectAll());
    }


    @Test
    public void getMap() {
        System.out.println(service.getMap());
    }


    @Test
    public void getRemark() {
        System.out.println(service.getRemark("1"));
    }

    @Test
    public void selectMenu(){
        System.out.println(service.selectMenu(1));
    }
}
