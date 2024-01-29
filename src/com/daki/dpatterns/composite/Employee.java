package com.stefancipe.dpatterns.composite;

import java.util.List;

public abstract class Employee {
    private String name;
    private int age;
    private String email;

    public Employee(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void addSubordinate(Employee employee);
    public abstract void removeSubordinate(String email);
    public abstract List<Employee> getSubordinates();

}
