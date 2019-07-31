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

    PartTimeStat findByPartTimeIdAndStatDate(int partTimeId, String statDate);

    PageHolder<PartTimeStat> queryPartTimeStat(PartTimeStatQuery query);

    int updateBrowseNum(int partTimeId,int num,int userNum);

    int updateCopyNum(int partTimeId,int num);

    int updateJoinNum(int partTimeId,int num);

}
