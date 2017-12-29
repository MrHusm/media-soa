package com.yxsd.kanshu.dao.impl;

import com.yxsd.kanshu.dao.IUserAccountLogDao;
import com.yxsd.kanshu.ucenter.model.UserAccountLog;
import org.springframework.stereotype.Repository;

/**
 * Created by hushengmeng on 2017/7/4.
 */
@Repository(value="userAccountLogDao")
public class UserAccountLogDaoImpl extends BaseDaoImpl<UserAccountLog> implements IUserAccountLogDao {
}
