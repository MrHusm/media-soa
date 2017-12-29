package com.yxsd.kanshu.pay.model;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by lenovo on 2017/8/6.
 */
public class AlipayOrder implements Serializable {

    private static final long serialVersionUID = -7053180264632214460L;
    
    private Long alipayOrderId;

    private Long userId;

    /**
     * 购买的产品ID
     */
    private Long productId;

    /**
     * 订单号
     */
    private String WIDoutTradeNo;

    /**
     * 商品名称
     */
    private String WIDsubject;

    /**
     * 付款金额
     */
    private Double WIDtotalAmount;

    /**
     * 商品描述
     */
    private String WIDbody;

    /**
     * 渠道号
     */
    private Integer channel;

    /**
     * 类型 ：支付宝充值 -1:充值并单章购买 -2：充值并批量购买 -3：充值并全本购买 -4：VIP购买
     */
    private Integer type;

    /**
     * 备注
     */
    private String comment;

    private Date createDate;

    private Date updateDate;

    public Long getAlipayOrderId() {
        return alipayOrderId;
    }

    public void setAlipayOrderId(Long alipayOrderId) {
        this.alipayOrderId = alipayOrderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getWIDoutTradeNo() {
        return WIDoutTradeNo;
    }

    public void setWIDoutTradeNo(String WIDoutTradeNo) {
        this.WIDoutTradeNo = WIDoutTradeNo;
    }

    public String getWIDsubject() {
        return WIDsubject;
    }

    public void setWIDsubject(String WIDsubject) {
        this.WIDsubject = WIDsubject;
    }

    public Double getWIDtotalAmount() {
        return WIDtotalAmount;
    }

    public void setWIDtotalAmount(Double WIDtotalAmount) {
        this.WIDtotalAmount = WIDtotalAmount;
    }

    public String getWIDbody() {
        return WIDbody;
    }

    public void setWIDbody(String WIDbody) {
        this.WIDbody = WIDbody;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
