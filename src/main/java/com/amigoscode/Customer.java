package com.amigoscode;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Customer {
    private Integer Id;
    private String name;
    private String email;
    private Integer age;

    public Customer() {

    }

    public Customer(Integer id, String name, String email, Integer age) {
        Id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
