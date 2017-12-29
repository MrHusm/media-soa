package com.yxsd.kanshu.api.impl;

import com.yxsd.kanshu.api.IUserApi;
import com.yxsd.kanshu.service.IUserService;
import com.yxsd.kanshu.ucenter.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

/**
 *
 * Description: 用户相关接口 All Rights Reserved.
 *
 * @version 1.0 2017年12月25日 by hushengmeng 创建
 */
@Component("userApi")
public class UserApiImpl implements IUserApi {

    @Resource(name = "userService")
    IUserService userService;

    @Override
    public User getUserByUserId(Long userId) {
        return userService.getUserByUserId(userId);
    }

    @Override
    public User register(String channel, Integer deviceType, String deviceSerialNo) {
        return userService.register(channel,deviceType,deviceSerialNo);
    }

    @Override
    public int consume(Long userId, Integer price, Integer type, Map<String, Object> map) {
        return userService.consume(userId,price,type,map);
    }

    @Override
    public void charge(Long userId, Integer type, Integer channel, String orderNo, Integer price, Integer money, Integer virtual) {
        userService.charge(userId,type,channel,orderNo,price,money,virtual);
    }
}
