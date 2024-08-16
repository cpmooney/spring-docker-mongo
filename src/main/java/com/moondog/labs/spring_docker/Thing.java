package com.moondog.labs.spring_docker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("item")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Thing {
    @Id
    private String id;

    private String shape;
    private String color;
}
