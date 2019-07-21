package com.chenghe.parttime.dao;

import com.chenghe.parttime.pojo.UserJoin;
import com.chenghe.parttime.query.UserJoinQuery;
import com.youguu.core.util.PageHolder;

/**
 * describe:
 *
 * @date: 2019/07/20 17:10:17:10
 * @version: V1.0
 * @review:
 */
public interface IUserJoinDAO {
    int addUserJoin(UserJoin userJoin);

    int updateUserJoin(UserJoin userJoin);

    UserJoin getUserJoin(int userId, int partTimeId);

    PageHolder<UserJoin> queryUserJoin(UserJoinQuery query);

}
