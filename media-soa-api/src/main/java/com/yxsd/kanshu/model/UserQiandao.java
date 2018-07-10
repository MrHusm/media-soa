package com.yxsd.kanshu.model;

import java.io.Serializable;
import java.util.Date;

public class UserQiandao implements Serializable{

    private static final long serialVersionUID = 296786699375850503L;

    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 激活时间
     */
    private String activeDate;

    /**
     * 连续签到天数
     */
    private Integer days;

    /**
     * 最后签到日期
     */
    private String lastQiandaoDate;

    /**
     * 是否通知 1：通知 0：不通知
     */
    private Short noticeType;

    private Date createDate;

    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(String activeDate) {
        this.activeDate = activeDate;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public String getLastQiandaoDate() {
        return lastQiandaoDate;
    }

    public void setLastQiandaoDate(String lastQiandaoDate) {
        this.lastQiandaoDate = lastQiandaoDate;
    }

    public Short getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(Short noticeType) {
        this.noticeType = noticeType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}