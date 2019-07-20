package com.chenghe.parttime.pojo;

import java.util.Date;

/**
 * describe:广告表
 *
 * @date: 2019/07/20 16:10:16:10
 * @version: V1.0
 * @review:
 */
public class Ad {
    private int id;
    private String categoryId;  //广告分类id
    private String imageUrl;    //图片地址
    private String url;         //跳转地址
    private int num;            //顺序号
    private int status;         //状态 0 有效  -1 无效
    private Date cTime;         //创建时间
    private Date mTime;         //修改时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Date getmTime() {
        return mTime;
    }

    public void setmTime(Date mTime) {
        this.mTime = mTime;
    }
}
