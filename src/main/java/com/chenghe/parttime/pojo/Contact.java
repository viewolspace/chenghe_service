package com.chenghe.parttime.pojo;

/**
 * Created by lenovo on 2019/9/2.
 */
public class Contact {
    private Integer contactType;    //联系方式类型  1 qq  2 微信 3 手机
    private String contact;     //联系方式

    public Integer getContactType() {
        return contactType;
    }

    public void setContactType(Integer contactType) {
        this.contactType = contactType;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
