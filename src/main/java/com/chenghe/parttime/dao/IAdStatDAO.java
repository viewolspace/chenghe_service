package com.chenghe.parttime.dao;

import com.chenghe.parttime.pojo.AdStat;
import com.chenghe.parttime.query.AdStatQuery;
import com.youguu.core.util.PageHolder;

/**
 * describe:
 *
 * @date: 2019/07/20 17:09:17:09
 * @version: V1.0
 * @review:
 */
public interface IAdStatDAO {
    int addAdStat(AdStat adStat);

    int updateBrowseNum(int adId, String data, int num, int userNum);

    AdStat findByAdIdAndStatDate(int adId, String statDate);

    PageHolder<AdStat> queryAdStat(AdStatQuery query);
}
