package com.chenghe.parttime.service.impl;

import com.chenghe.parttime.dao.IUserStatDAO;
import com.chenghe.parttime.pojo.UserStat;
import com.chenghe.parttime.query.UserStatQuery;
import com.chenghe.parttime.service.IUserStatService;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * describe:
 *
 * @date: 2019/07/20 17:22:17:22
 * @version: V1.0
 * @review:
 */
@Service("userStatService")
public class UserStatServiceImpl implements IUserStatService {
    @Resource
    private IUserStatDAO userStatDAO;

    @Override
    public int addUserStat(UserStat userStat) {
        return userStatDAO.addUserStat(userStat);
    }

    @Override
    public int updateUserStat(UserStat userStat) {
        return userStatDAO.updateUserStat(userStat);
    }

    @Override
    public UserStat findByStatDate(String statDate) {
        return userStatDAO.findByStatDate(statDate);
    }

    @Override
    public PageHolder<UserStat> queryUserStat(UserStatQuery query) {
        return userStatDAO.queryUserStat(query);
    }
}
