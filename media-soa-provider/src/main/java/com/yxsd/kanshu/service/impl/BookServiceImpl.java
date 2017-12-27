package com.yxsd.kanshu.service.impl;

import com.yxsd.kanshu.dao.IBaseDao;
import com.yxsd.kanshu.dao.IBookDao;
import com.yxsd.kanshu.product.model.Book;
import com.yxsd.kanshu.service.IBookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "bookService")
public class BookServiceImpl extends BaseServiceImpl<Book, Long> implements IBookService {

	@Resource(name="bookDao")
	private IBookDao bookDao;

	@Override
	public IBaseDao<Book> getBaseDao() {
		return bookDao;
	}
}
