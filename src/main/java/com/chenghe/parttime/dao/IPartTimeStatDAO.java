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

    int updateBrowseNum(int partTimeId,String data,int num,int userNum);

    int updateCopyNum(int partTimeId,String data,int num);

    int updateJoinNum(int partTimeId,String data,int num);

    PartTimeStat findByPartTimeIdAndStatDate(int partTimeId, String statDate);

    PageHolder<PartTimeStat> queryPartTimeStat(PartTimeStatQuery query);
}
