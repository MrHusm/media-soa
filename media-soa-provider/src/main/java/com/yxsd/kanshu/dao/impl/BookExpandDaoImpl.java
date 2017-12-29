package com.yxsd.kanshu.dao.impl;

import com.yxsd.kanshu.dao.IBookExpandDao;
import com.yxsd.kanshu.product.model.BookExpand;
import org.springframework.stereotype.Repository;

/**
 * Created by hushengmeng on 2017/7/4.
 */
@Repository(value="bookExpandDao")
public class BookExpandDaoImpl extends BaseDaoImpl<BookExpand> implements IBookExpandDao {
}
