package com.chenghe.parttime.dao;

import com.chenghe.parttime.pojo.PartTimeStat;
import com.chenghe.parttime.query.PartTimeStatQuery;
import com.youguu.core.util.PageHolder;

/**
 * describe:
 *
 * @date: 2019/07/20 17:09:17:09
 * @version: V1.0
 * @review:
 */
public interface IPartTimeStatDAO {
    int addPartTimeStat(PartTimeStat partTimeStat);

    int updatePartTimeStat(PartTimeStat partTimeStat);

    PartTimeStat findByPartTimeIdAndStatDate(String partTimeId, String statDate);

    PageHolder<PartTimeStat> queryPartTimeStat(PartTimeStatQuery query);
}
