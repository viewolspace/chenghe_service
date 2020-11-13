package com.chenghe.parttime.service.impl;

import com.chenghe.parttime.dao.SysDictionaryDAO;
import com.chenghe.parttime.dao.SysUserDAO;
import com.chenghe.parttime.pojo.SysDictionary;
import com.chenghe.parttime.pojo.SysUser;
import com.chenghe.parttime.service.ISysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2020/5/2.
 */
@Service("sysUserService")
public class SysUserServiceImpl implements ISysUserService {

    @Resource
    private SysUserDAO sysUserDAO;


    @Resource
    private SysDictionaryDAO sysDictionaryDAO;


    @Override
    public List<SysUser> selectAll() {
        return sysUserDAO.selectAll();
    }


    @Override
    public Map<Integer, Integer> getMap() {
        Map<Integer,Integer> map = new HashMap<>();
        List<SysUser> list = sysUserDAO.selectAll();
        if(list!=null &&list.size()>0){
            for(SysUser sysUser:list){
                String companyId = sysUser.getCompanyId();
                if(companyId!=null && !"".equals(companyId)){
                    String[] companyIds = companyId.split(",");
                    for(String str:companyIds){
                        try{
                            map.put(Integer.parseInt(str),sysUser.getId());
                        }catch (Exception e){
                            e.printStackTrace();
                        }

                    }
                }

            }
        }
        return map;
    }

    @Override
    public String getRemark(String appId) {
        return sysDictionaryDAO.getRemark(appId);
    }

    @Override
    public List<SysDictionary> selectMenu(int appId) {
        return sysDictionaryDAO.selectMenu(appId);
    }
}
