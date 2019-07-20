package com.chenghe.parttime.dao;

import com.chenghe.parttime.pojo.Company;
import com.chenghe.parttime.query.CompanyQuery;
import com.youguu.core.util.PageHolder;

/**
 * describe:
 *
 * @author: shi_lei@suixingpay.com
 * @date: 2019/07/20 17:08:17:08
 * @version: V1.0
 * @review:
 */
public interface ICompanyDAO {

    int addCompany(Company company);

    int updateCompany(Company company);

    Company getCompany(int id);

    PageHolder<Company> queryCompany(CompanyQuery query);
}
