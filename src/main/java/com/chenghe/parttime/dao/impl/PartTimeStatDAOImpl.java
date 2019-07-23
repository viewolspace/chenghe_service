package com.chenghe.parttime.dao.impl;

import com.chenghe.parttime.dao.BaseDAO;
import com.chenghe.parttime.dao.IPartTimeStatDAO;
import com.chenghe.parttime.pojo.PartTimeStat;
import com.chenghe.parttime.query.PartTimeStatQuery;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

/**
 * describe:
 *
 * @date: 2019/07/20 17:18:17:18
 * @version: V1.0
 * @review:
 */
@Repository("partTimeStatDAO")
public class PartTimeStatDAOImpl extends BaseDAO<PartTimeStat> implements IPartTimeStatDAO {
    @Override
    public int addPartTimeStat(PartTimeStat partTimeStat) {
        return super.insert(partTimeStat);
    }



    @Override
    public PartTimeStat findByPartTimeIdAndStatDate(int partTimeId, String statDate) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("partTimeId", partTimeId);
        hashMap.put("statDate", statDate);
        return super.findUniqueBy("findByPartTimeIdAndStatDate", hashMap);
    }

    @Override
    public PageHolder<PartTimeStat> queryPartTimeStat(PartTimeStatQuery query) {
        return super.pagedQuery("findByParams", query.getMap(), query.getPageIndex(), query.getPageSize());
    }

    @Override
    public int updateBrowseNum(int partTimeId, String data,int num) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("partTimeId", partTimeId);
        hashMap.put("statDate", data);
        hashMap.put("browseNum", num);
        return super.updateBy("updateNum",hashMap);
    }

    @Override
    public int updateCopyNum(int partTimeId, String data,int num) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("partTimeId", partTimeId);
        hashMap.put("statDate", data);
        hashMap.put("copyNum", num);
        return super.updateBy("updateNum",hashMap);
    }

    @Override
    public int updateJoinNum(int partTimeId, String data,int num) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("partTimeId", partTimeId);
        hashMap.put("statDate", data);
        hashMap.put("joinNum", num);
        return super.updateBy("updateNum",hashMap);
    }


}
