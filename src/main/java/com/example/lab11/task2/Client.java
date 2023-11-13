package com.example.lab11.task2;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder @ToString @Getter
public class Client {
    private static int count = 0;

    @Builder.Default
    private int id = ++count;

    private String name;
    private String mail;
    private int age;
    private Gender sex;
}
