package com.chenghe.parttime.dao.impl;

import com.chenghe.parttime.dao.BaseDAO;
import com.chenghe.parttime.dao.IPartTimeDAO;
import com.chenghe.parttime.pojo.PartTime;
import com.chenghe.parttime.query.PartTimeQuery;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Repository;

/**
 * describe:
 *
 * @author: shi_lei@suixingpay.com
 * @date: 2019/07/20 17:18:17:18
 * @version: V1.0
 * @review:
 */
@Repository("partTimeDAO")
public class PartTimeDAOImpl extends BaseDAO<PartTime> implements IPartTimeDAO {
    @Override
    public int addPartTime(PartTime partTime) {
        return super.insert(partTime);
    }

    @Override
    public int updatePartTime(PartTime partTime) {
        return super.update(partTime);
    }

    @Override
    public PartTime getPartTime(int id) {
        return super.get(id);
    }

    @Override
    public PageHolder<PartTime> queryPartTime(PartTimeQuery query) {
        return super.pagedQuery("findByParams", query.getMap(), query.getPageIndex(), query.getPageSize());
    }

    @Override
    public int delete(int id) {
        return super.delete(id);
    }
}
