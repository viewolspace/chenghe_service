package com.chenghe.parttime.pojo;

/**
 * Created by lenovo on 2020/6/30.
 */
public class ChannelView {

    private int id;

    private String appId;

    private String version;

    private String channel;

    private int type;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ChannelView{" +
                "id=" + id +
                ", appId='" + appId + '\'' +
                ", version='" + version + '\'' +
                ", channel='" + channel + '\'' +
                ", type=" + type +
                '}';
    }
}
