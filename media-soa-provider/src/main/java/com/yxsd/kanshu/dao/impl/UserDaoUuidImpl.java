package com.yxsd.kanshu.dao.impl;

import com.yxsd.kanshu.dao.IUserUuidDao;
import com.yxsd.kanshu.ucenter.model.UserUuid;
import org.springframework.stereotype.Repository;

/**
 * Created by hushengmeng on 2017/7/4.
 */
@Repository(value="userUuidDao")
public class UserDaoUuidImpl extends BaseDaoImpl<UserUuid> implements IUserUuidDao {
}
