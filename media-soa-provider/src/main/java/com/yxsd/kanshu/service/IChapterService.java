package com.yxsd.kanshu.service;

import com.yxsd.kanshu.product.model.Chapter;

import java.util.List;

/**
 * Created by lenovo on 2017/8/7.
 */
public interface IChapterService extends IChapterBaseService<Chapter,Long> {
    /**
     * 根据图书id获取章节
     * @param bookId
     * @param num 章节表序号
     * @param type  0:获取所有章节（包括下架） 1：获取所有上架章节
     * @return
     */
    public List<Chapter> getChaptersByBookId(Long bookId, Integer num,Integer type);

    /**
     * 根据图书id获取上架章节列表
     * @param bookId
     * @param num 章节表序号
     * @return
     */
    public List<Chapter> getChaptersByBookId(Long bookId, Integer num);

    /**
     * 获取章节信息
     * @param chapterId
     * @param type 1:带章节内容 其他：不带章节内容
     * @param num 章节表序号
     * @return
     */
    public Chapter getChapterById(Long chapterId, Integer type, Integer num);

    /**
     * 保存章节信息
     * @param chapter
     * @param num
     */
    public int saveChapter(Chapter chapter, Integer num);

    /**
     * 修改章节信息
     * @param chapter
     * @param num
     */
    public int updateChapter(Chapter chapter, Integer num);

    /**
     * 获取章节更新的数量
     * @param bookId
     * @param num
     * @param index
     * @param num
     */
    public Integer updatedChapterCount(Long bookId, Integer num, Integer index);


    /**
     * 清除章节相关缓存
     * @param chapterId
     */
    public void clearChapterAllCache(Long chapterId);

}
