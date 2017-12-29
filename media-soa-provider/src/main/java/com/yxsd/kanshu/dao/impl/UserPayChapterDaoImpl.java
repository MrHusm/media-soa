package com.yxsd.kanshu.dao.impl;

import com.yxsd.kanshu.dao.IUserPayChapterDao;
import com.yxsd.kanshu.ucenter.model.UserPayChapter;
import org.springframework.stereotype.Repository;

/**
 * Created by hushengmeng on 2017/7/4.
 */
@Repository(value="userPayChapterDao")
public class UserPayChapterDaoImpl extends BaseDaoImpl<UserPayChapter> implements IUserPayChapterDao {
}
