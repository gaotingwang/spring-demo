package com.gtw.mybatis.dao;

import com.gtw.mybatis.entity.Seckill;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)//junit启动时加载springIoc容器
@ContextConfiguration("classpath:spring/spring-dao.xml")//指出spring配置文件位置
public class SeckillDaoTest {
    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void reduceNumber() throws Exception {
        long seckillId = 1;
        int updateCount = seckillDao.reduceNumber(seckillId, new Date());
        Assert.assertSame(1, updateCount);
    }

    @Test
    public void queryById() throws Exception {
        long seckillId = 1;
        Seckill seckill = seckillDao.queryById(seckillId);
        Assert.assertNotNull(seckill);
    }

    @Test
    public void queryAll() throws Exception {
        List<Seckill> seckills = seckillDao.queryAll(0,100);
        Assert.assertTrue((!seckills.isEmpty() && seckills.size() >= 4));
    }

}