package com.yxsd.kanshu.service.impl;

import com.yxsd.kanshu.dao.IBaseDao;
import com.yxsd.kanshu.dao.IUserAccountLogDao;
import com.yxsd.kanshu.service.IUserAccountLogService;
import com.yxsd.kanshu.ucenter.model.UserAccountLog;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by hushengmeng on 2017/7/4.
 */
@Service(value="userAccountLogService")
public class UserAccountLogServiceImpl extends BaseServiceImpl<UserAccountLog, Long> implements IUserAccountLogService {

    @Resource(name="userAccountLogDao")
    private IUserAccountLogDao userAccountLogDao;

    @Override
    public IBaseDao<UserAccountLog> getBaseDao() {
        return userAccountLogDao;
    }
}
