package com.chenghe.parttime.service;

import com.chenghe.parttime.pojo.SysUser;

import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2020/5/2.
 */
public interface ISysUserService {
    List<SysUser> selectAll();

    Map<Integer,Integer>  getMap();


    String getRemark(String appId);
}
