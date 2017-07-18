package com.gtw.mongo.dao;

import com.gtw.mongo.model.BaseEntity;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public interface IMongoBasicDao<T extends BaseEntity> {

    /**
     * 查询一个Collection中的对象
     * @param id id
     * @param clazz 对象的Class
     */
    T findById(String id, Class<T> clazz);

    /**
     * 查询一个Collection中的对象
     * @param criteria 查询的条件
     * @param clazz T对象的Class
     */
    T findOne(Criteria criteria, Class<T> clazz);

    /**
     * 查询一个Collection中的对象
     * @param query 查询的条件
     * @param clazz T对象的Class
     */
    T findOne(Query query, Class<T> clazz);

    /**
     * 查询符合条件的Collection中的多个对象
     * @param criteria 查询条件
     * @param clazz T对象的Class
     * @return 集合对象
     */
    List<T> findList(Criteria criteria, Class<T> clazz);

}
