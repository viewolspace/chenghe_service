package com.chenghe.parttime.pojo;

import java.util.Date;

/**
 * Created by lenovo on 2018/6/27.
 */
public class Category {

    public static final int TYPE_COM = 1; //展商分类
    public static final int TYPE_PRODUCT = 2; //产品分类

    private String id;
    private String parentId;
    private Integer type; //1 展商分类  2 产品分类
    private Integer num;
    private String name;
    private Date cTime;
    private Integer appId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getcTime() {
        return cTime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", parentId='" + parentId + '\'' +
                ", type=" + type +
                ", num=" + num +
                ", name='" + name + '\'' +
                ", cTime=" + cTime +
                '}';
    }
}
