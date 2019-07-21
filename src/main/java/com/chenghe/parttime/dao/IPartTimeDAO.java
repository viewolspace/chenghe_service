package com.chenghe.parttime.dao;

import com.chenghe.parttime.pojo.Ad;
import com.chenghe.parttime.pojo.PartTime;
import com.chenghe.parttime.query.AdQuery;
import com.chenghe.parttime.query.PartTimeQuery;
import com.youguu.core.util.PageHolder;

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

    PartTime getPartTime(int id);

    PageHolder<PartTime> queryPartTime(PartTimeQuery query);

    int delete(int id);
}
