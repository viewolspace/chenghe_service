package com.chenghe.parttime.dao.impl;

import com.chenghe.parttime.dao.BaseDAO;
import com.chenghe.parttime.dao.IAdClickDAO;
import com.chenghe.parttime.pojo.AdClick;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;

/**
 * describe:
 *
 * @author: shi_lei@suixingpay.com
 * @date: 2019/07/20 17:18:17:18
 * @version: V1.0
 * @review:
 */
@Repository("adClickDAO")
public class AdClickDAOImpl extends BaseDAO<AdClick> implements IAdClickDAO {
    @Override
    public int addAdClick(AdClick adClick) {
        adClick.setcTime(new Date());
        return super.insert(adClick);
    }

    @Override
    public AdClick getAdClick(int userId, int adId, int type) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("userId", userId);
        hashMap.put("adId", adId);
        hashMap.put("type", type);
        return this.findUniqueBy("findByUserIdAndAdId", hashMap);
    }
}
