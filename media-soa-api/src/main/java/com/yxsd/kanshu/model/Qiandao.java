package com.yxsd.kanshu.model;

import java.io.Serializable;
import java.util.Date;

public class Qiandao implements Serializable{

    private static final long serialVersionUID = 6205009819812986870L;

    private Long id;

    /**
     * 签到赠币字符串
     */
    private String content;

    private Date createDate;

    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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