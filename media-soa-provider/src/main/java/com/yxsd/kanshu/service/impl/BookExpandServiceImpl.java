package com.yxsd.kanshu.service.impl;

import com.yxsd.kanshu.dao.IBaseDao;
import com.yxsd.kanshu.dao.IBookExpandDao;
import com.yxsd.kanshu.product.model.BookExpand;
import com.yxsd.kanshu.service.IBookExpandService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/8/7.
 */
@Service(value="bookExpandService")
public class BookExpandServiceImpl extends BaseServiceImpl<BookExpand, Long> implements IBookExpandService {

    @Resource(name="bookExpandDao")
    private IBookExpandDao bookExpandDao;

    @Resource(name = "masterRedisTemplate")
    private RedisTemplate<String,BookExpand> masterRedisTemplate;

    @Resource(name = "slaveRedisTemplate")
    private RedisTemplate<String,BookExpand> slaveRedisTemplate;

    @Override
    public IBaseDao<BookExpand> getBaseDao() {
        return bookExpandDao;
    }

    @Override
    public BookExpand getMaxClickBook() {
        return this.bookExpandDao.selectOne("BookExpandMapper.getMaxClickBook");
    }
}
