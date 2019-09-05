package com.chenghe.parttime.service;

import com.chenghe.parttime.pojo.AdStat;
import com.chenghe.parttime.query.AdStatQuery;
import com.youguu.core.util.PageHolder;

/**
 * describe:
 *
 * @date: 2019/07/20 17:11:17:11
 * @version: V1.0
 * @review:
 */
public interface IAdStatService {

    int addAdStat(AdStat adStat);

    AdStat findByAdIdAndStatDate(int adId, String statDate);

    PageHolder<AdStat> queryAdStatStat(AdStatQuery query);

    int updateBrowseNum(int adId, int num, int userNum);

    int userClick(int userId,int adId);
}
