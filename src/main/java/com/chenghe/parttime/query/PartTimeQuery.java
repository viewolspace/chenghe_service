package com.chenghe.parttime.query;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2018/6/29.
 */
public class PartTimeQuery {
    private String title;

    private String recommend;

    private Integer verify;

    private String companyId;  //商户id

    private int pageIndex = 1;

    private int pageSize = 20;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public Map getMap() {
        Map<String, Object> map = new HashMap<>();
        if (title != null) {
            map.put("title", title);
        }

        if (recommend != null) {
            map.put("recommend", recommend);
        }

        if(verify != null){
            map.put("verify", verify);
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

    public Integer getVerify() {
        return verify;
    }

    public void setVerify(Integer verify) {
        this.verify = verify;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
