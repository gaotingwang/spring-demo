package com.gtw.mongo.dao;

import com.gtw.mongo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonMongoDao implements IMongoBasicDao<Person> {
    
    private final MongoTemplate mongoTemplate;

    @Autowired
    public PersonMongoDao(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    /**
     * 查询一个Collection中的对象
     * @param id id
     * @param clazz 对象的Class
     */
    public Person findById(String id, Class<Person> clazz){
        return mongoTemplate.findById(id, clazz);
    }

    /**
     * 查询一个Collection中的对象
     * @param criteria 查询的条件
     * @param clazz T对象的Class
     */
    public Person findOne(Criteria criteria, Class<Person> clazz){
        return mongoTemplate.findOne(new Query(criteria), clazz);
    }

    /**
     * 查询一个Collection中的对象
     * @param query 查询的条件
     * @param clazz T对象的Class
     */
    public Person findOne(Query query, Class<Person> clazz){
        return mongoTemplate.findOne(query, clazz);
    }

    /**
     * 查询符合条件的Collection中的多个对象
     * @param criteria 查询条件
     * @param clazz T对象的Class
     * @return 集合对象
     */
    public List<Person> findList(Criteria criteria, Class<Person> clazz){
        return mongoTemplate.find(new Query(criteria), clazz);
    }
}
