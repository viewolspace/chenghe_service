package com.chenghe.parttime.dao;

import com.chenghe.parttime.base.BaseTestClass;
import org.junit.Test;

public class WxTokenDAOImplTest extends BaseTestClass {

    private IWxTokenDAO dao = (IWxTokenDAO)getInstance("wxTokenDAO");


    @Test
    public void updateToken() {
        dao.updateToken("1111111111111", "33333333333333333333333333333444444444444");
    }

    @Test
    public void uodateJsapiTicket() {
        dao.updateJsapiTicket("1111111111111","ssssssssssssssssssssssssssssss");
    }

    @Test
    public void getWxToken() {
        WxToken wxToken = dao.getWxToken("1111111111111");
        System.out.println(wxToken.getToken());
    }
}