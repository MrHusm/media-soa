package com.yxsd.kanshu.api.impl;

import com.yxsd.kanshu.api.IChapterApi;
import com.yxsd.kanshu.constant.RedisKeyConstants;
import com.yxsd.kanshu.product.model.Book;
import com.yxsd.kanshu.product.model.Chapter;
import com.yxsd.kanshu.service.IChapterService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *
 * Description: 章节相关接口 All Rights Reserved.
 *
 * @version 1.0 2017年12月28日 by hushengmeng 创建
 */
@Component("chapterApi")
public class ChapterApiImpl implements IChapterApi {

    @Resource(name = "chapterService")
    IChapterService chapterService;

    @Override
    public Chapter getChapterById(Long chapterId, Integer type, Integer num) {
        return chapterService.getChapterById(chapterId,type,num);
    }

    @Override
    public List<Chapter> getChaptersByBookId(Long bookId, Integer num, Integer type) {
        return this.chapterService.getChaptersByBookId(bookId,num,type);
    }

    @Override
    public List<Chapter> getChaptersByBookId(Long bookId, Integer num) {
        return chapterService.getChaptersByBookId(bookId,num);
    }
}
