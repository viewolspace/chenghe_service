package com.chenghe.parttime.query;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2018/6/29.
 */
public class AdQuery {
    private String title;
    private String categoryId;
    private Integer status;         //状态 0 有效  -1 无效

    private int pageIndex = 1;

    private int pageSize = 20;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Map getMap() {
        Map<String, Object> map = new HashMap<>();
        if (title != null) {
            map.put("title", title);
        }
        if (categoryId != null) {
            map.put("categoryId", categoryId);
        }
        if (status != null) {
            map.put("status", status);
        }
        return map;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
