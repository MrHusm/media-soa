package com.yxsd.kanshu.api.impl;

import com.yxsd.kanshu.api.IBookApi;
import com.yxsd.kanshu.constant.RedisKeyConstants;
import com.yxsd.kanshu.product.model.Book;
import com.yxsd.kanshu.service.IBookService;
import org.springframework.data.redis.core.RedisTemplate;
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

    @Resource(name = "masterRedisTemplate")
    private RedisTemplate<String,Book> masterRedisTemplate;

    @Resource(name = "slaveRedisTemplate")
    private RedisTemplate<String,Book> slaveRedisTemplate;

    @Override
    public Book getBookById(Long bookId) {
        String key = RedisKeyConstants.CACHE_BOOK_KEY+bookId;
        Book book = this.slaveRedisTemplate.opsForValue().get(key);
//        if(book == null){
//            book = bookService.findUniqueByParams("bookId",bookId);
//            if(book != null){
//                this.masterRedisTemplate.opsForValue().set(key,book,5, TimeUnit.HOURS);
//            }
//        }
        return book;
    }
}
