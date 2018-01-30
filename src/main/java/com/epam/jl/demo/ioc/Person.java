package com.epam.jl.demo.ioc;

public interface Person {
    String getFirstName();

    String getLastName();

    Country getCountry();

    int getAge();

    float getHeight();

    boolean isProgrammer();

    boolean isBroke();

    java.util.List<Contact> getContacts();
}
