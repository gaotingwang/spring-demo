//package com.gtw.mongo.dao;
//
//import com.gtw.mongo.model.BaseEntity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.query.Criteria;
//import org.springframework.data.mongodb.core.query.Query;
//
//import java.util.List;
//
//public class MongoBasicDao<T extends BaseEntity> implements IMongoBasicDao<T> {
//
//    @Autowired
//    private MongoTemplate mongoTemplate;
//
//    /**
//     * 查询一个Collection中的对象
//     * @param id id
//     * @param clazz 对象的Class
//     */
//    public T findById(String id, Class<T> clazz){
//        return mongoTemplate.findById(id, clazz);
//    }
//
//    /**
//     * 查询一个Collection中的对象
//     * @param criteria 查询的条件
//     * @param clazz T对象的Class
//     */
//    public T findOne(Criteria criteria, Class<T> clazz){
//        return mongoTemplate.findOne(new Query(criteria), clazz);
//    }
//
//    /**
//     * 查询一个Collection中的对象
//     * @param query 查询的条件
//     * @param clazz T对象的Class
//     */
//    public T findOne(Query query, Class<T> clazz){
//        return mongoTemplate.findOne(query, clazz);
//    }
//
//    /**
//     * 查询符合条件的Collection中的多个对象
//     * @param criteria 查询条件
//     * @param clazz T对象的Class
//     * @return 集合对象
//     */
//    public List<T> findList(Criteria criteria, Class<T> clazz){
//        return mongoTemplate.find(new Query(criteria), clazz);
//    }
//
//}
