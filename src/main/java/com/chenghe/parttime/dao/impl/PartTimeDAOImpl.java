package com.chenghe.parttime.dao.impl;

import com.chenghe.parttime.dao.BaseDAO;
import com.chenghe.parttime.dao.IPartTimeDAO;
import com.chenghe.parttime.pojo.PartTime;
import com.chenghe.parttime.query.PartTimeQuery;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public int updateRecommned(int id, int recommend) {
        Map<String,Object> map = new HashMap<>();
        map.put("recommend",recommend);
        map.put("id",id);
        return super.updateBy("updateRecommned",map);
    }

    @Override
    public List<PartTime> queryByIds(List<Integer> ids) {
        Map<String,Object> map = new HashMap<>();
        map.put("idlist",ids);
        return super.findBy("queryByIds",map);
    }

    @Override
    public List<PartTime> listRecommend(int recommend, int pageIndex, int pageSize) {
        Map<String,Object> map = new HashMap<>();
        map.put("recommend",recommend);
        return super.pagedBy("listRecommend",map,pageIndex,pageSize);
    }

    @Override
    public List<PartTime> listAll(String title, int pageIndex, int pageSize) {
        Map<String,Object> map = new HashMap<>();
        map.put("title",title);
        return super.pagedBy("listAll",map,pageIndex,pageSize);
    }

    @Override
    public List<PartTime> listAllByApp(String title, String recommend, int pageIndex, int pageSize) {
        Map<String,Object> map = new HashMap<>();
        map.put("title",title);
        map.put("recommend",recommend);
        return super.pagedBy("listAllByApp",map,pageIndex,pageSize);
    }

    @Override
    public List<PartTime> listByCategory(String categoryId, int pageIndex, int pageSize) {
        Map<String,Object> map = new HashMap<>();
        map.put("categoryId",categoryId);
        return super.pagedBy("listByCategory",map,pageIndex,pageSize);
    }

    @Override
    public List<PartTime> listMyjoin(int userId, int pageIndex, int pageSize) {
        Map<String,Object> map = new HashMap<>();
        map.put("userId",userId);
        return super.pagedBy("listMyjoin",map,pageIndex,pageSize);
    }
}
