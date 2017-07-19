package com.gtw.mybatis.service;

import com.gtw.mybatis.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})//告诉junit spring的配置文件
public class SeckillServiceTest {
    @Autowired
    private SeckillService seckillService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void getSeckillList() throws Exception {
        List<Seckill> seckills=seckillService.getSeckillList();
        logger.info("Seckills = {}", seckills);
    }

    @Test
    public void getById() throws Exception {
        long seckillId=1L;
        Seckill seckill = seckillService.getById(seckillId);
        logger.info("Seckill = {}", seckill);
    }

}