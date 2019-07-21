package com.chenghe.parttime.service.impl;

import com.chenghe.parttime.dao.IPartTimeStatDAO;
import com.chenghe.parttime.pojo.PartTimeStat;
import com.chenghe.parttime.query.PartTimeStatQuery;
import com.chenghe.parttime.service.IPartTimeStatService;
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
@Service("partTimeStatService")
public class PartTimeStatServiceImpl implements IPartTimeStatService {
    @Resource
    private IPartTimeStatDAO partTimeStatDAO;

    @Override
    public int addPartTimeStat(PartTimeStat partTimeStat) {
        return partTimeStatDAO.addPartTimeStat(partTimeStat);
    }

    @Override
    public int updatePartTimeStat(PartTimeStat partTimeStat) {
        return partTimeStatDAO.updatePartTimeStat(partTimeStat);
    }

    @Override
    public PartTimeStat findByPartTimeIdAndStatDate(String partTimeId, String statDate) {
        return partTimeStatDAO.findByPartTimeIdAndStatDate(partTimeId, statDate);
    }

    @Override
    public PageHolder<PartTimeStat> queryPartTimeStat(PartTimeStatQuery query) {
        return partTimeStatDAO.queryPartTimeStat(query);
    }
}
