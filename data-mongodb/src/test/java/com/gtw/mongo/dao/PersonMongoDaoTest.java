package com.gtw.mongo.dao;

import com.gtw.mongo.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)//junit启动时加载springIoc容器
@ContextConfiguration("classpath:spring-config-mongo.xml")//指出spring配置文件位置
public class PersonMongoDaoTest {

    @Autowired
    private PersonMongoDao personDao;

    @Test
    public void find() throws Exception {
        Person person = this.personDao.findById("1", Person.class);
        System.out.println(person);

        // 使用query对象查询
        Query query = new Query(Criteria.where("age").is(34));
        person = this.personDao.findOne(query, Person.class);
        System.out.println(person);

        // 使用query对象查询列表
//        query = new Query(Criteria.where("age").lt(30)).// age小于30
//             with(new Sort(Sort.Direction.ASC, "age"));// age 升序
//        query.with(Pageable );//可分页查询

        List<Person> list = this.personDao.findList(Criteria.where("age").lt(30), Person.class);// age小于30
        System.out.println(list);
    }

}