package com.gtw.mongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class BaseEntity implements java.io.Serializable {

    private static final long serialVersionUID = 6254832781876190326L;

    @Id
    private String id;
}
