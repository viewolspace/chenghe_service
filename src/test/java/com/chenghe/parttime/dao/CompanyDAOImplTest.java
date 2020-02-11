package com.chenghe.parttime.dao;

import com.chenghe.parttime.base.BaseTestClass;
import com.chenghe.parttime.query.CompanyQuery;
import org.junit.Test;

/**
 * Created by lenovo on 2018/6/28.
 */
public class CompanyDAOImplTest extends BaseTestClass {

    private ICompanyDAO dao = (ICompanyDAO)getInstance("companyDAO");


    @Test
    public void listCategorys(){
        CompanyQuery query = new CompanyQuery();
        query.setAppId(1);
        System.out.println(dao.queryCompany(query));
    }
}
