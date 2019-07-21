package com.chenghe.parttime.dao.impl;

import com.chenghe.parttime.dao.BaseDAO;
import com.chenghe.parttime.dao.IAdDAO;
import com.chenghe.parttime.pojo.Ad;
import com.chenghe.parttime.query.AdQuery;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Repository;

/**
 * describe:
 *
 * @author: shi_lei@suixingpay.com
 * @date: 2019/07/20 17:16:17:16
 * @version: V1.0
 * @review:
 */
@Repository("adDAO")
public class AdDAOImpl extends BaseDAO<Ad> implements IAdDAO {
    @Override
    public int addAd(Ad ad) {
        return super.insert(ad);
    }

    @Override
    public int updateAd(Ad ad) {
        return super.update(ad);
    }

    @Override
    public Ad getAd(int id) {
        return super.get(id);
    }

    @Override
    public PageHolder<Ad> queryAd(AdQuery query) {
        return super.pagedQuery("findByParams",query.getMap(),query.getPageIndex(),query.getPageSize());
    }

    @Override
    public int delete(int id) {
        return super.delete(id);
    }
}
