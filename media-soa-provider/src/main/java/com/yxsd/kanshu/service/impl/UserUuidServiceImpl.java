package com.yxsd.kanshu.service.impl;

import com.yxsd.kanshu.dao.IBaseDao;
import com.yxsd.kanshu.dao.IUserUuidDao;
import com.yxsd.kanshu.service.IUserUuidService;
import com.yxsd.kanshu.ucenter.model.UserUuid;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by hushengmeng on 2017/7/4.
 */
@Service(value="userUuidService")
public class UserUuidServiceImpl extends BaseServiceImpl<UserUuid, Long> implements IUserUuidService {

    @Resource(name="userUuidDao")
    private IUserUuidDao userUuidDao;

    @Override
    public IBaseDao<UserUuid> getBaseDao() {
        return userUuidDao;
    }
}
