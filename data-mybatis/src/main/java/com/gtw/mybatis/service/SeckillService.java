package com.gtw.mybatis.service;

import com.gtw.mybatis.entity.Seckill;

import java.util.List;

/**
 * 业务接口:站在使用者(程序员)的角度设计接口
 * 三个方面:
 * 1.方法定义粒度，方法定义的要非常清楚
 * 2.参数要越简练越好
 * 3.返回类型(return 类型一定要友好/或者return异常，我们允许的异常)
 */
public interface SeckillService {

    /**
     * 查询全部的秒杀记录
     */
    List<Seckill> getSeckillList();

    /**
     * 查询单个秒杀记录
     */
    Seckill getById(long seckillId);
}
