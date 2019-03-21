package com.tx.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class User implements Serializable {

    private Long id;

    private Long userId;

    private String name;

    private Integer age;
}
