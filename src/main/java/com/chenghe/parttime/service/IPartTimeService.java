package com.chenghe.parttime.service;

import com.chenghe.parttime.pojo.PartTime;
import com.chenghe.parttime.query.PartTimeQuery;
import com.youguu.core.util.PageHolder;

import java.util.List;

/**
 * describe:
 *
 * @date: 2019/07/20 17:12:17:12
 * @version: V1.0
 * @review:
 */
public interface IPartTimeService {

    int addPartTime(PartTime partTime);

    int updatePartTime(PartTime partTime);

    PartTime getPartTime(int id);

    PageHolder<PartTime> queryPartTime(PartTimeQuery query);

    int delete(int id);

    int updateRecommnet(int id,int recommnet);

    /**
     * 查询 热门 或者 精选
     * @param recommnet
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<PartTime> listRecomment(int recommnet,int pageIndex,int pageSize);

    /**
     * 查询全部 或者 搜索
     * @param title
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<PartTime> listAll(String title,int pageIndex,int pageSize);


    /**
     * 查询分类下数据
     * @param categoryId
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<PartTime> listByCategory(String categoryId,int pageIndex,int pageSize);
}
