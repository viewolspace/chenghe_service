package com.chenghe.parttime.pojo;

import java.util.Date;

/**
 * describe:
 *
 * @date: 2019/07/20 16:11:16:11
 * @version: V1.0
 * @review:
 */
public class UserJoin {
    private Integer userId;
    private Integer partTimeId;
    private Integer type;
    private Date cTime;
    private Date mTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPartTimeId() {
        return partTimeId;
    }

    public void setPartTimeId(Integer partTimeId) {
        this.partTimeId = partTimeId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
