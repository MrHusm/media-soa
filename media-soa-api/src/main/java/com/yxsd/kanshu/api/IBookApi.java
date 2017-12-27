package com.yxsd.kanshu.api;

import com.yxsd.kanshu.product.model.Book;

/**
 * 
 * Description: 书籍相关接口 All Rights Reserved.
 * 
 * @version 1.0 2017年12月25日 by hushengmeng 创建
 */
public interface IBookApi {

    /**
     * 根据图书id获取图书信息
     * @param bookId
     * @return
     */
    public Book getBookById(Long bookId);
}
