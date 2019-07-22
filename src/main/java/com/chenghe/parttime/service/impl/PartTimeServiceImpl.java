package com.chenghe.parttime.service.impl;

import com.chenghe.parttime.dao.IPartTimeDAO;
import com.chenghe.parttime.pojo.PartTime;
import com.chenghe.parttime.query.PartTimeQuery;
import com.chenghe.parttime.service.IPartTimeService;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * describe:
 *
 * @date: 2019/07/20 17:20:17:20
 * @version: V1.0
 * @review:
 */
@Service("partTimeService")
public class PartTimeServiceImpl implements IPartTimeService {
    @Resource
    private IPartTimeDAO partTimeDAO;

    @Override
    public int addPartTime(PartTime partTime) {
        return partTimeDAO.addPartTime(partTime);
    }

    @Override
    public int updatePartTime(PartTime partTime) {
        return partTimeDAO.updatePartTime(partTime);
    }

    @Override
    public PartTime getPartTime(int id) {
        return partTimeDAO.getPartTime(id);
    }

    @Override
    public PageHolder<PartTime> queryPartTime(PartTimeQuery query) {
        return partTimeDAO.queryPartTime(query);
    }

    @Override
    public int delete(int id) {
        return partTimeDAO.delete(id);
    }

    @Override
    public int updateRecommnet(int id, int recommnet) {
        return partTimeDAO.updateRecommnet(id, recommnet);
    }

    @Override
    public List<PartTime> listRecomment(int recommnet, int pageIndex, int pageSize) {
        return partTimeDAO.listRecomment(recommnet, pageIndex, pageSize);
    }

    @Override
    public List<PartTime> listAll(String title, int pageIndex, int pageSize) {
        return partTimeDAO.listAll(title, pageIndex, pageSize);
    }

    @Override
    public List<PartTime> listByCategory(String categoryId, int pageIndex, int pageSize) {
        return partTimeDAO.listByCategory(categoryId, pageIndex, pageSize);
    }
}
