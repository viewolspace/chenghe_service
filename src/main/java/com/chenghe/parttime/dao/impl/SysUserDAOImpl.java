package com.chenghe.parttime.dao.impl;

import com.chenghe.parttime.dao.BaseDAO;
import com.chenghe.parttime.dao.SysUserDAO;
import com.chenghe.parttime.pojo.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lenovo on 2020/5/2.
 */
@Repository("sysUserDAO")
public class SysUserDAOImpl extends BaseDAO<SysUser> implements SysUserDAO {

    @Override
    public List<SysUser> selectAll() {
        return super.findBy("selectAll",null);
    }
}
