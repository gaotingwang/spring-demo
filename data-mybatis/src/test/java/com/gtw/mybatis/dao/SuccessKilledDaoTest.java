package com.gtw.mybatis.dao;

import com.gtw.mybatis.entity.SuccessKilled;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SuccessKilledDaoTest {
    @Autowired
    private SuccessKilledDao successKilledDao;

    @Test
    public void insertSuccessKilled() throws Exception {
        long seckillId=1L;
        long userPhone=13476191877L;
        int insertCount=successKilledDao.insertSuccessKilled(seckillId,userPhone);
        Assert.assertSame(1, insertCount);
    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
        long seckillId=1L;
        long userPhone=13476191877L;
        SuccessKilled successKilled=successKilledDao.queryByIdWithSeckill(seckillId,userPhone);
        Assert.assertNotNull(successKilled);
    }

}