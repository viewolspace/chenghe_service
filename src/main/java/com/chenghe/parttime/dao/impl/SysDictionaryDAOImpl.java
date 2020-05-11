package com.chenghe.parttime.dao.impl;

import com.chenghe.parttime.dao.BaseDAO;
import com.chenghe.parttime.dao.SysDictionaryDAO;
import com.chenghe.parttime.pojo.SysDictionary;
import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 2020/5/11.
 */
@Repository("sysDictionaryDAO")
public class SysDictionaryDAOImpl extends BaseDAO<SysDictionary> implements SysDictionaryDAO {
    @Override
    public String getRemark(String appId) {

        SysDictionary sysDictionary = this.findUniqueBy("selectRemark",appId);

        return sysDictionary==null?"":sysDictionary.getRemark();

    }
}
