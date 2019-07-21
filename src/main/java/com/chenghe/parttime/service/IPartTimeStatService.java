package com.chenghe.parttime.service;

import com.chenghe.parttime.pojo.PartTimeStat;
import com.chenghe.parttime.query.PartTimeStatQuery;
import com.youguu.core.util.PageHolder;

/**
 * describe:
 *
 * @date: 2019/07/20 17:11:17:11
 * @version: V1.0
 * @review:
 */
public interface IPartTimeStatService {
    int addPartTimeStat(PartTimeStat partTimeStat);

    int updatePartTimeStat(PartTimeStat partTimeStat);

    PartTimeStat findByPartTimeIdAndStatDate(String partTimeId, String statDate);

    PageHolder<PartTimeStat> queryPartTimeStat(PartTimeStatQuery query);
}
