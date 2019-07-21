package com.chenghe.parttime.dao;

import com.chenghe.parttime.pojo.PartTime;
import com.chenghe.parttime.query.PartTimeQuery;
import com.youguu.core.util.PageHolder;

import java.util.List;

/**
 * describe:
 *
 * @date: 2019/07/20 17:09:17:09
 * @version: V1.0
 * @review:
 */
public interface IPartTimeDAO {
    int addPartTime(PartTime partTime);

    int updatePartTime(PartTime partTime);

    int updateRecommnet(int id,int recommnet);

    PartTime getPartTime(int id);

    PageHolder<PartTime> queryPartTime(PartTimeQuery query);

    int delete(int id);

    List<PartTime> listRecomment(int recommnet,int pageIndex,int pageSize);


    List<PartTime> listAll(String title,int pageIndex,int pageSize);


}
