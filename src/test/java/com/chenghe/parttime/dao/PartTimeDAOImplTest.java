package com.chenghe.parttime.dao;

import com.chenghe.parttime.base.BaseTestClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/6/28.
 */
public class PartTimeDAOImplTest extends BaseTestClass {

    private IPartTimeDAO dao = (IPartTimeDAO)getInstance("partTimeDAO");


    @Test
    public void queryByIds(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(dao.queryByIds(list));
    }
}
