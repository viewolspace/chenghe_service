package com.chenghe.parttime.service;

import com.chenghe.parttime.base.BaseTestClass;
import org.junit.Test;

/**
 * Created by lenovo on 2018/6/28.
 */
public class AdStatServiceImplTest extends BaseTestClass {

    private IAdStatService service = (IAdStatService) getInstance("adStatService");



    @Test
    public void userClick() {
        service.userClick(1,1);
        service.userClick(2,1);
        service.userClick(3,1);
        service.userClick(1,1);

        service.userClick(1,3);
        service.userClick(1,2);
        service.userClick(2,2);
        service.userClick(3,2);
        service.userClick(1,2);


        service.userClick(1,3);
        service.userClick(2,3);
        service.userClick(3,3);
        service.userClick(1,3);
    }
}
