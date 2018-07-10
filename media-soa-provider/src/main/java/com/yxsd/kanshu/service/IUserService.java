package com.yxsd.kanshu.service;

import com.yxsd.kanshu.ucenter.model.User;

import java.util.Map;

/**
 * Created by hushengmeng on 2017/7/4.
 */
public interface IUserService extends IBaseService<User,Long> {

    /**
     * 根据用户id查询用户
     * @param userId
     * @return
     */
    public User getUserByUserId(Long userId);

    /**
     * 注册用户
     * @param channel 渠道号
     * @param deviceType 1:Android 2:IOS 3:H5
     * @param deviceSerialNo imei->android_id->serialNunber ->UUID生成的
     * @return
     */
    public User register(String channel, Integer deviceType, String deviceSerialNo);

    /**
     * 消费
     * @param userId
     * @param price
     * @param type  -1:单章购买 -2：批量购买 -3：全本购买 -4：VIP消费
     * @param map
     * @return 0:成功 -1：余额不够
     */
    public int consume(Long userId, Integer price, Integer type, Map<String, Object> map);

    /**
     * 充值
     * @param userId
     * @param type 1：支付宝充值 2：微信充值 11:客服赠送 12:签到赠送 13:新手礼包
     * @param orderNo 订单号
     * @param price 真钱值
     * @param virtual 赠送金额
     * @param money 充值金额
     * @return
     */
    public void charge(Long userId, Integer type, Integer channel, String orderNo,Integer price,Integer money, Integer virtual);

}
