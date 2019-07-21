package com.chenghe.parttime.query;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2018/6/29.
 */
public class PartTimeQuery {
    private String title;

    private Integer recommnent;

    private int pageIndex = 1;

    private int pageSize = 20;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map getMap() {
        Map<String, Object> map = new HashMap<>();
        if (title != null) {
            map.put("title", title);
        }

        if (recommnent != null) {
            map.put("recommnent", recommnent);
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
