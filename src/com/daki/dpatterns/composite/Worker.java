package com.stefancipe.dpatterns.composite;

import java.util.List;

public class Worker extends Employee {

    public Worker(String name, int age, String email) {
        super(name, age, email);
    }

    private void error() {
        System.out.println("Doesn't have subordinates");
    }

    @Override
    public void addSubordinate(Employee employee) {
        error();
    }

    @Override
    public void removeSubordinate(String email) {
        error();
    }

    @Override
    public List<Employee> getSubordinates() {
        System.out.println("Doesn't have subordinates");
        return null;
    }

    @Override
    public String toString() {
        return "Worker " + this.getName();
    }
}
