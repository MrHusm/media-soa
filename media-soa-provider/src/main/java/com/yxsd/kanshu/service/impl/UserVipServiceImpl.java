package com.yxsd.kanshu.service.impl;

import com.yxsd.kanshu.dao.IBaseDao;
import com.yxsd.kanshu.dao.IUserVipDao;
import com.yxsd.kanshu.service.IUserVipService;
import com.yxsd.kanshu.ucenter.model.UserVip;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by hushengmeng on 2017/7/4.
 */
@Service(value="userVipService")
public class UserVipServiceImpl extends BaseServiceImpl<UserVip, Long> implements IUserVipService {

    @Resource(name="userVipDao")
    private IUserVipDao userVipDao;

    @Override
    public IBaseDao<UserVip> getBaseDao() {
        return userVipDao;
    }

}
