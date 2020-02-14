package com.chenghe.parttime.query;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2018/6/29.
 */
public class AdStatQuery {
    private Integer adId;
    private Date statDate;

    private int pageIndex = 1;

    private int pageSize = 20;

    private String companyId;

    private String categoryId;


    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public Date getStatDate() {
        return statDate;
    }

    public void setStatDate(Date statDate) {
        this.statDate = statDate;
    }

    public Map getMap() {
        Map<String, Object> map = new HashMap<>();
        if (adId != null) {
            map.put("adId", adId);
        }
        if (statDate != null) {
            map.put("statDate", statDate);
        }
        if (companyId != null) {
            map.put("companyId", companyId);
        }
        if (categoryId != null) {
            map.put("categoryId", categoryId);
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

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
