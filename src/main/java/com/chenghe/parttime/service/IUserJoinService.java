package com.chenghe.parttime.service;

import com.chenghe.parttime.pojo.UserJoin;
import com.chenghe.parttime.query.UserJoinQuery;
import com.youguu.core.util.PageHolder;

/**
 * describe:
 *
 * @date: 2019/07/20 17:11:17:11
 * @version: V1.0
 * @review:
 */
public interface IUserJoinService {
    int addUserJoin(int userId, int partTimeId,int type);

    int updateUserJoin(UserJoin userJoin);

    UserJoin getUserJoin(int userId, int partTimeId,int type);

    PageHolder<UserJoin> queryUserJoin(UserJoinQuery query);
}
