package com.yxsd.kanshu.dao.impl;

import com.yxsd.kanshu.dao.IRechargeItemDao;
import com.yxsd.kanshu.pay.model.RechargeItem;
import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 2017/8/6.
 */
@Repository(value="rechargeItemDao")
public class RechargeItemDaoImpl extends BaseDaoImpl<RechargeItem> implements IRechargeItemDao {


    @Override
    public Integer getMaxVirtual() {
        return (Integer) this.getSqlSessionQueryTemplate().selectOne("RechargeItemMapper.getMaxVirtual");
    }
}
