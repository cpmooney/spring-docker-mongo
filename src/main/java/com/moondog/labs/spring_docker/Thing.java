package com.moondog.labs.spring_docker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("thing")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Thing {
    @Id
    @MongoId
    private String id;

    private String shape;
    private String color;
}
