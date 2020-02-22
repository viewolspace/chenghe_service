package com.chenghe.parttime.pojo;

import java.util.Date;

/**
 * describe:
 *
 * @date: 2019/07/20 16:11:16:11
 * @version: V1.0
 * @review:
 */
public class AdStat {
    private Integer AdId;
    private Date statDate;
    private Integer browseUserNum;
    private Integer browseNum;
    private Integer copyNum;
    private Integer joinNum;
    private Date cTime;
    private String title;
    private int companyId;
    private String categoryId;
    private String categoryName;

    public Integer getAdId() {
        return AdId;
    }

    public void setAdId(Integer adId) {
        this.AdId = adId;
    }

    public Date getStatDate() {
        return statDate;
    }

    public void setStatDate(Date statDate) {
        this.statDate = statDate;
    }

    public Integer getBrowseNum() {
        return browseNum;
    }

    public void setBrowseNum(Integer browseNum) {
        this.browseNum = browseNum;
    }

    public Integer getCopyNum() {
        return copyNum;
    }

    public void setCopyNum(Integer copyNum) {
        this.copyNum = copyNum;
    }

    public Integer getJoinNum() {
        return joinNum;
    }

    public void setJoinNum(Integer joinNum) {
        this.joinNum = joinNum;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Integer getBrowseUserNum() {
        return browseUserNum;
    }

    public void setBrowseUserNum(Integer browseUserNum) {
        this.browseUserNum = browseUserNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
