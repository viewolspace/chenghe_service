package com.chenghe.parttime.dao;

import com.chenghe.parttime.pojo.SysDictionary;

import java.util.List;

/**
 * Created by lenovo on 2020/5/11.
 */
public interface SysDictionaryDAO {

    String getRemark(String appId);

    List<SysDictionary> selectMenu(int appId);

}
