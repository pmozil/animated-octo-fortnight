package com.example.lab11.task1;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder @ToString
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
}