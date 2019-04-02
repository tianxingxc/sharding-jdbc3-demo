package com.tx.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Student implements Serializable {
    private Long id;
    private Integer age;
    private Long userId;
    private String name;
}
