package com.chenghe.parttime.pojo;

import java.util.Date;

/**
 * describe:
 *
 * @date: 2019/07/20 16:11:16:11
 * @version: V1.0
 * @review:
 */
public class PartTimeStat {
    private Integer partTimeId;
    private Date statDate;
    private Integer browseUserNum;
    private Integer browseNum;
    private Integer copyNum;
    private Integer joinNum;
    private Date cTime;
    private int recommend;
    /**
     * 推荐位置中文描述，管理平台对该字段赋值
     */
    private String recommendName;

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

    public int getRecommend() {
        return recommend;
    }

    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }

    public String getRecommendName() {
        return recommendName;
    }

    public void setRecommendName(String recommendName) {
        this.recommendName = recommendName;
    }
}
