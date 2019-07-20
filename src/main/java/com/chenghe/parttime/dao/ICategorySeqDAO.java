package com.chenghe.parttime.dao;

import com.chenghe.parttime.pojo.CategorySeq;

/**
 * Created by lenovo on 2018/6/28.
 */
public interface ICategorySeqDAO {

    int addCategorySeq(CategorySeq categorySeq);


    int updateCategorySeq(String parentId);


    CategorySeq getCategorySeq(String parentId);


}
