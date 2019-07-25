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

    /**
     * 管理平台使用
     * @param id
     * @return
     */
    PartTime getPartTime(int id);

    /**
     * 前端使用 同时会进行浏览统计
     * 统计点击的数量
     * @param id
     * @return
     */
    PartTime getAndStatPartTime(int id,int uid,String idfa);

    PageHolder<PartTime> queryPartTime(PartTimeQuery query);

    int delete(int id);

    int updateRecommned(int id,int recommend);

    /**
     * 查询 热门 或者 精选
     * @param recommend
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<PartTime> listRecommend(int recommend,int pageIndex,int pageSize);

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

    /**
     * 复制
     * @param userId
     * @param partTimeId
     * @return
     */
    int copyPartTime(int userId,int partTimeId);

    /**
     * 报名
     * @param userId
     * @param partTimeId
     * @return
     */
    int joinPartTime(int userId,int partTimeId);

    List<PartTime> listMyjoin(int userId,int pageIndex,int pageSize);
}
