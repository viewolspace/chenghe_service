package com.chenghe.parttime.service.impl;

import com.chenghe.parttime.dao.IUserJoinDAO;
import com.chenghe.parttime.pojo.UserJoin;
import com.chenghe.parttime.query.UserJoinQuery;
import com.chenghe.parttime.service.IUserJoinService;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * describe:
 *
 * @date: 2019/07/20 17:21:17:21
 * @version: V1.0
 * @review:
 */
@Service("userJoinService")
public class UserJoinServiceImpl implements IUserJoinService {
    @Resource
    private IUserJoinDAO userJoinDAO;

    @Override
    public int addUserJoin(int userId, int partTimeId,int type) {
        UserJoin userJoin = userJoinDAO.getUserJoin(userId, partTimeId, type);
        if(userJoin==null){
            userJoin = new UserJoin();
            userJoin.setPartTimeId(partTimeId);
            userJoin.setUserId(userId);
            userJoin.setType(type);
            return userJoinDAO.addUserJoin(userJoin);
        }else{
            return 0;
        }

    }

    @Override
    public int updateUserJoin(UserJoin userJoin) {
        return userJoinDAO.updateUserJoin(userJoin);
    }

    @Override
    public UserJoin getUserJoin(int userId, int partTimeId,int type) {
        return userJoinDAO.getUserJoin(userId, partTimeId,type);
    }

    @Override
    public PageHolder<UserJoin> queryUserJoin(UserJoinQuery query) {
        return userJoinDAO.queryUserJoin(query);
    }
}
