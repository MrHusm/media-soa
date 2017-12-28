package com.yxsd.kanshu.api.impl;

import com.yxsd.kanshu.api.IBookApi;
import com.yxsd.kanshu.product.model.Book;
import com.yxsd.kanshu.service.IBookService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 *
 * Description: 书籍相关接口 All Rights Reserved.
 *
 * @version 1.0 2017年12月25日 by hushengmeng 创建
 */
@Component("bookApi")
public class BookApiImpl implements IBookApi {

    @Resource(name = "bookService")
    IBookService bookService;

    @Override
    public Book getBookById(Long bookId) {
        return this.bookService.get(bookId);
    }
}
