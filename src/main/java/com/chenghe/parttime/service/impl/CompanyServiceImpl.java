package com.chenghe.parttime.service.impl;

import com.chenghe.parttime.dao.ICompanyDAO;
import com.chenghe.parttime.pojo.Company;
import com.chenghe.parttime.query.CompanyQuery;
import com.chenghe.parttime.service.ICompanyService;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * describe:
 *
 * @author: shi_lei@suixingpay.com
 * @date: 2019/07/20 17:20:17:20
 * @version: V1.0
 * @review:
 */
@Service("companyService")
public class CompanyServiceImpl implements ICompanyService {

    @Resource
    private ICompanyDAO companyDAO;


    @Override
    public int addCompany(Company company) {
        return companyDAO.addCompany(company);
    }

    @Override
    public int updateCompany(Company company) {
        return companyDAO.updateCompany(company);
    }

    @Override
    public Company getCompany(int id) {
        return companyDAO.getCompany(id);
    }

    @Override
    public PageHolder<Company> queryCompany(CompanyQuery query) {
        return companyDAO.queryCompany(query);
    }

    @Override
    public int delete(int id) {
        return companyDAO.delete(id);
    }

    @Override
    public List<Company> queryAll() {
        return companyDAO.queryAll();
    }
}
