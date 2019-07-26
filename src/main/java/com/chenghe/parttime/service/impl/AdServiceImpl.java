package com.chenghe.parttime.service.impl;

import com.chenghe.parttime.dao.IAdDAO;
import com.chenghe.parttime.pojo.Ad;
import com.chenghe.parttime.pojo.Category;
import com.chenghe.parttime.query.AdQuery;
import com.chenghe.parttime.service.IAdService;
import com.chenghe.parttime.service.ICategoryService;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * describe:
 *
 * @date: 2019/07/20 17:20:17:20
 * @version: V1.0
 * @review:
 */
@Service("adService")
public class AdServiceImpl implements IAdService {

    @Resource
    private IAdDAO adDAO;
    @Resource
    private ICategoryService categoryService;

    @Override
    public int addAd(Ad ad) {
        return adDAO.addAd(ad);
    }

    @Override
    public int updateAd(Ad ad) {
        return adDAO.updateAd(ad);
    }

    @Override
    public Ad getAd(int id) {
        return adDAO.getAd(id);
    }

    @Override
    public PageHolder<Ad> queryAd(AdQuery query) {

        PageHolder<Ad> pageHolder = adDAO.queryAd(query);
        for (Ad ad : pageHolder) {
            Category category = categoryService.getCategory(ad.getCategoryId());
            ad.setCategoryName(category.getName());
        }
        return pageHolder;
    }

    @Override
    public int delete(int id) {
        return adDAO.delete(id);
    }

    @Override
    public List<Ad> listAd(String categoryId) {
        return adDAO.listAd(categoryId);
    }
}
