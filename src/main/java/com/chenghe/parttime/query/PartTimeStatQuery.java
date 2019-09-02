package com.chenghe.parttime.query;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2018/6/29.
 */
public class PartTimeStatQuery {
    private Integer partTimeId;
    private Date statDate;

    private int pageIndex = 1;

    private int pageSize = 20;

    private Integer companyId;

    public Integer getPartTimeId() {
        return partTimeId;
    }

    public void setPartTimeId(Integer partTimeId) {
        this.partTimeId = partTimeId;
    }

    public Date getStatDate() {
        return statDate;
    }

    public void setStatDate(Date statDate) {
        this.statDate = statDate;
    }

    public Map getMap() {
        Map<String, Object> map = new HashMap<>();
        if (partTimeId != null) {
            map.put("partTimeId", partTimeId);
        }
        if (statDate != null) {
            map.put("statDate", statDate);
        }
        if (companyId != null) {
            map.put("companyId", companyId);
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

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}
