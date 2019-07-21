package com.chenghe.parttime.dao;

import com.chenghe.parttime.pojo.Ad;
import com.chenghe.parttime.query.AdQuery;
import com.youguu.core.util.PageHolder;

import java.util.List;

/**
 * describe:
 *
 * @date: 2019/07/20 17:08:17:08
 * @version: V1.0
 * @review:
 */
public interface IAdDAO {
    int addAd(Ad ad);

    int updateAd(Ad ad);

    Ad getAd(int id);

    PageHolder<Ad> queryAd(AdQuery query);

    int delete(int id);

    List<Ad> listAd(String categoryId);
}
