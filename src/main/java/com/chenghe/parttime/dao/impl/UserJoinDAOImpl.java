package com.chenghe.parttime.dao.impl;

import com.chenghe.parttime.dao.BaseDAO;
import com.chenghe.parttime.dao.IUserJoinDAO;
import com.chenghe.parttime.pojo.UserJoin;
import com.chenghe.parttime.query.UserJoinQuery;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

/**
 * describe:
 *
 * @author: shi_lei@suixingpay.com
 * @date: 2019/07/20 17:18:17:18
 * @version: V1.0
 * @review:
 */
@Repository("userJoinDAO")
public class UserJoinDAOImpl extends BaseDAO<UserJoin> implements IUserJoinDAO {
    @Override
    public int addUserJoin(UserJoin userJoin) {
        return super.insert(userJoin);
    }

    @Override
    public int updateUserJoin(UserJoin userJoin) {
        return super.update(userJoin);
    }

    @Override
    public UserJoin getUserJoin(int userId, int partTimeId) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("userId", userId);
        hashMap.put("partTimeId", partTimeId);
        return this.findUniqueBy("findByUserIdAndPartTimeId", hashMap);
    }

    @Override
    public PageHolder<UserJoin> queryUserJoin(UserJoinQuery query) {
        return super.pagedQuery("findByParams",query.getMap(),query.getPageIndex(),query.getPageSize());
    }
}
