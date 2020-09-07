package com.chenghe.parttime.pojo;

/**
 * Created by lenovo on 2020/6/30.
 */
public class ChannelView {
    private String appIds;

    private String channelNos;

    private String phoneNums;

    public String getAppIds() {
        return appIds;
    }

    public void setAppIds(String appIds) {
        this.appIds = appIds;
    }

    public String getChannelNos() {
        return channelNos;
    }

    public void setChannelNos(String channelNos) {
        this.channelNos = channelNos;
    }

    public String getPhoneNums() {
        return phoneNums;
    }

    public void setPhoneNums(String phoneNums) {
        this.phoneNums = phoneNums;
    }

    @Override
    public String toString() {
        return "ChannelView{" +
                "appIds='" + appIds + '\'' +
                ", channelNos='" + channelNos + '\'' +
                ", phoneNums='" + phoneNums + '\'' +
                '}';
    }
}
