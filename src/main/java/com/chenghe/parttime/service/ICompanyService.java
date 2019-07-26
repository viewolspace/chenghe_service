package com.chenghe.parttime.service;

import com.chenghe.parttime.pojo.Company;
import com.chenghe.parttime.query.CompanyQuery;
import com.youguu.core.util.PageHolder;

import java.util.List;

/**
 * describe:
 *
 * @author: shi_lei@suixingpay.com
 * @date: 2019/07/20 17:12:17:12
 * @version: V1.0
 * @review:
 */
public interface ICompanyService {

    int addCompany(Company company);

    int updateCompany(Company company);

    Company getCompany(int id);

    PageHolder<Company> queryCompany(CompanyQuery query);

    int delete(int id);

    List<Company> queryAll();
}
