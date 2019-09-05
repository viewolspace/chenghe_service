package com.chenghe.parttime.dao.impl;

import com.chenghe.parttime.dao.BaseDAO;
import com.chenghe.parttime.dao.IAdStatDAO;
import com.chenghe.parttime.pojo.AdStat;
import com.chenghe.parttime.query.AdStatQuery;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;

/**
 * describe:
 *
 * @date: 2019/07/20 17:18:17:18
 * @version: V1.0
 * @review:
 */
@Repository("adStatDAO")
public class AdStatDAOImpl extends BaseDAO<AdStat> implements IAdStatDAO {
    @Override
    public int addAdStat(AdStat adStat) {
        adStat.setcTime(new Date());
        return super.insert(adStat);
    }

    @Override
    public int updateBrowseNum(int adId, String data, int num, int userNum) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("adId", adId);
        hashMap.put("statDate", data);
        hashMap.put("browseNum", num);
        hashMap.put("browseUserNum", userNum);
        return super.updateBy("updateNum",hashMap);
    }

    @Override
    public AdStat findByAdIdAndStatDate(int adId, String statDate) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("adId", adId);
        hashMap.put("statDate", statDate);
        return super.findUniqueBy("findByAdIdAndStatDate", hashMap);
    }

    @Override
    public PageHolder<AdStat> queryAdStat(AdStatQuery query) {
        return super.pagedQuery("findByParams", query.getMap(), query.getPageIndex(), query.getPageSize());
    }
}
