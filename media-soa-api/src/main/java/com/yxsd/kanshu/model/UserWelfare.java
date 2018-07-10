package com.yxsd.kanshu.model;

import java.io.Serializable;
import java.util.Date;

public class UserWelfare implements Serializable{

    private static final long serialVersionUID = -6793593226710417281L;

    private Long id;

    /**
     * 默认渠道赠送vip的天数
     */
    private Integer days;

    /**
     * 赠送金额
     */
    private Integer money;

    /**
     * 赠币的渠道
     */
    private String channels;

    /**
     * 不显示新手礼包的渠道
     */
    private String channelsNo;

    private Date createDate;

    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getChannels() {
        return channels;
    }

    public void setChannels(String channels) {
        this.channels = channels;
    }

    public String getChannelsNo() {
        return channelsNo;
    }

    public void setChannelsNo(String channelsNo) {
        this.channelsNo = channelsNo;
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