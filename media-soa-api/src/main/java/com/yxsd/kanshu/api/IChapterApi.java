package com.yxsd.kanshu.api;

import com.yxsd.kanshu.product.model.Chapter;

import java.util.List;

/**
 * 
 * Description: 章节相关接口 All Rights Reserved.
 * 
 * @version 1.0 2017年12月27日 by hushengmeng 创建
 */
public interface IChapterApi {

    /**
     * 获取章节信息
     * @param chapterId
     * @param type 1:带章节内容 其他：不带章节内容
     * @param num 章节表序号
     * @return
     */
    public Chapter getChapterById(Long chapterId, Integer type, Integer num);

    /**
     * 根据图书id获取章节列表
     * @param bookId
     * @param num num 章节表序号
     * @param type  0:获取所有章节（包括下架） 1：获取所有上架章节
     * @return
     */
    public List<Chapter> getChaptersByBookId(Long bookId, Integer num,Integer type);

    /**
     * 根据图书id获取所有上架章节列表
     * @param bookId
     * @param num num 章节表序号
     * @return
     */
    public List<Chapter> getChaptersByBookId(Long bookId, Integer num);
}
