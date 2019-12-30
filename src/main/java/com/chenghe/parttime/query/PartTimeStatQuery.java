package com.chenghe.parttime.query;

import com.chenghe.parttime.pojo.PartTime;

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

    private String companyId;

    private Integer app; // 1 兼职圈  2 土豆兼职 3 彩虹兼职

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

        if (app!=null && app!=0){
            if(app==1){
                map.put("recommend", PartTime.RECOMMEND_JZQ);
            }else if(app==2){
                map.put("recommend", PartTime.RECOMMEND_TDJZ);
            }else  if(app==3){
                map.put("recommend", PartTime.RECOMMEND_CHJZ);
            }

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

    public Integer getApp() {
        return app;
    }

    public void setApp(Integer app) {
        this.app = app;
    }
}
