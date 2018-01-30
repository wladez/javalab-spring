package com.epam.jl.demo.ioc;

import lombok.Value;

import java.util.List;

@Value
public class SimplePerson implements Person {
    private String firstName;
    private String lastName;
    private Country country;
    private int age;
    private float height;
    private boolean isProgrammer;
    private boolean broke;
    private List<Contact> contacts;
}

