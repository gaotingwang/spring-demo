package com.gtw.mybatis.service.impl;

import com.gtw.mybatis.dao.SeckillDao;
import com.gtw.mybatis.dao.SuccessKilledDao;
import com.gtw.mybatis.entity.Seckill;
import com.gtw.mybatis.service.SeckillService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class SeckillServiceImpl implements SeckillService {
    private final SeckillDao seckillDao;
    private final SuccessKilledDao successKilledDao;

    private final String md5Salt="!@#$%^&*()_+_)(*&^%$#@!";//md5盐值

    @Autowired
    public SeckillServiceImpl(SeckillDao seckillDao, SuccessKilledDao successKilledDao) {
        this.seckillDao = seckillDao;
        this.successKilledDao = successKilledDao;
    }

    public List<Seckill> getSeckillList() {
        return seckillDao.queryAll(0,4);
    }

    @Transactional
    public Seckill getById(long seckillId) {
        return seckillDao.queryById(seckillId);
    }

}
