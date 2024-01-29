package com.stefancipe.dpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    private List<Employee> subordinates;

    public Manager(String name, int age, String email) {
        super(name, age, email);
        subordinates = new ArrayList<>();
    }

    @Override
    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    @Override
    public void removeSubordinate(String email) {
        int toRemove = -1;
        for (int i = 0; i< subordinates.size(); i++) {
            if(subordinates.get(i).getEmail().equals(email)) {
                toRemove = i;
                break;
            }
        }
        if(toRemove != -1) subordinates.remove(toRemove);
    }

    @Override
    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Manager "+ getName() + " { \n" +
                "subordinates=" + subordinates +
                "\n}";
    }
}
