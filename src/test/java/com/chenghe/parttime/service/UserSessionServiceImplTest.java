package com.chenghe.parttime.service;

import com.chenghe.parttime.base.BaseTestClass;
import org.junit.Test;

public class UserSessionServiceImplTest extends BaseTestClass {

    private IUserSessionService userSessionService = (IUserSessionService) getInstance("userSessionService");

    @Test
    public void saveSession() {
        userSessionService.saveSession(111, UserSession.TYPE_MA);
    }

    @Test
    public void updateSession() {
        userSessionService.updateSession(111, UserSession.TYPE_MA);
    }

    @Test
    public void getSession() {
        UserSession session = userSessionService.getSession(111);
        System.out.println(session);
    }
}