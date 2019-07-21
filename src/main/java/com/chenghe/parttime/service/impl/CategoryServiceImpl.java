package com.chenghe.parttime.service.impl;

import com.chenghe.parttime.dao.ICategoryDAO;
import com.chenghe.parttime.dao.ICategorySeqDAO;
import com.chenghe.parttime.pojo.Category;
import com.chenghe.parttime.pojo.CategorySeq;
import com.chenghe.parttime.service.ICategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2018/6/28.
 */
@Service("categoryService")
public class CategoryServiceImpl implements ICategoryService {

    @Resource
    private ICategoryDAO categoryDAO;

    @Resource
    private ICategorySeqDAO categorySeqDAO;



    private String getNextValue(String parentId){
        int seq = 1;
        CategorySeq categorySeq = categorySeqDAO.getCategorySeq(parentId);
        if(categorySeq==null){
            categorySeq = new CategorySeq();
            categorySeq.setParentId(parentId);
            categorySeq.setSeq(seq);
            categorySeqDAO.addCategorySeq(categorySeq);
        }else{
            seq = categorySeq.getSeq() + 1;
            categorySeqDAO.updateCategorySeq(parentId);
        }
        String seq_str = String.valueOf(seq);
        if(seq_str.length()<4){
            return parentId + "0000".substring(0,4-seq_str.length()) + seq_str;
        }else{
            return null;
        }

    }

    @Transactional("partTimeTX")
    @Override
    public String addCategory(Category category) {
        String parentId = category.getParentId();
        String id = getNextValue(parentId);
        category.setId(id);
        int result = categoryDAO.addCategory(category);
        if(result>0){
            return id;
        }else{
            return null;
        }

    }

    @Override
    public int delCategory(String id) {
        return categoryDAO.delCategory(id);
    }

    @Override
    public int updateCategory(Category category) {
        return categoryDAO.updateCategory(category);
    }

    @Override
    public Category getCategory(String id) {
        return categoryDAO.getCategory(id);
    }

    @Override
    public List<Category> listByParent(String parentId) {
        return categoryDAO.listByParent(parentId);
    }

    @Override
    public List<Category> listAll(String parentId) {
        return categoryDAO.listAll(parentId);
    }
}
