package com.yxsd.kanshu.dao.impl;

import com.yxsd.kanshu.dao.IBookDao;
import com.yxsd.kanshu.product.model.Book;
import org.springframework.stereotype.Repository;

@Repository(value = "bookDao")
public class BookDaoImpl extends BaseDaoImpl<Book> implements IBookDao {
}
