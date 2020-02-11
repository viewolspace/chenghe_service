package com.chenghe.parttime.pojo;

import com.chenghe.parttime.util.ImageUtils;

/**
 * describe:
 *
 * @date: 2019/07/20 16:10:16:10
 * @version: V1.0
 * @review:
 */
public class Company {
    private Integer id;
    private String name;
    private String logo;
    private String qq;
    private String wx;
    private String phone;
    private String des;
    private Integer star;
    private Integer appId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return ImageUtils.addUrlImage(logo);
    }

    public void setLogo(String logo) {
        this.logo = ImageUtils.diffUrlImage(logo);
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }
}
