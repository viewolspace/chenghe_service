package com.chenghe.parttime.dao.impl;

import com.chenghe.parttime.dao.BaseDAO;
import com.chenghe.parttime.dao.ICompanyDAO;
import com.chenghe.parttime.pojo.Company;
import com.chenghe.parttime.query.CompanyQuery;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * describe:
 *
 * @date: 2019/07/20 17:16:17:16
 * @version: V1.0
 * @review:
 */
@Repository("companyDAO")
public class CompanyDAOImpl extends BaseDAO<Company> implements ICompanyDAO {
    @Override
    public int addCompany(Company company) {
        return super.insert(company);
    }

    @Override
    public int updateCompany(Company company) {
        return super.update(company);
    }

    @Override
    public Company getCompany(int id) {
        return super.get(id);
    }

    @Override
    public PageHolder<Company> queryCompany(CompanyQuery query) {
        return super.pagedQuery("findByParams", query.getMap(), query.getPageIndex(), query.getPageSize());
    }

    @Override
    public int delete(int id) {
        return super.delete(id);
    }

    @Override
    public List<Company> queryAll() {
        return super.getAll();
    }

    @Override
    public List<Company> queryCompanyByApp(int appId) {
        Map<String, Object> map = new HashMap<>();
        map.put("appId", appId);
        return super.findBy("queryCompanyByApp", map);
    }
}
