package com.gtw.mongo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@EqualsAndHashCode(callSuper = false)
@Document(collection="person")
public class Person extends BaseEntity {

    private static final long serialVersionUID = -6165276894679077154L;

    private String id;

    private String name;

    private int age;

}
