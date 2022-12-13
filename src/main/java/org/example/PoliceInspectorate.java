package org.example;

import java.util.List;

public class PoliceInspectorate {
    private String name;
    private String address;

    private List<Employee> employees;

    public PoliceInspectorate(String name, String address, List<Employee> employees) {
        this.name = name;
        this.address = address;
        this.employees = employees;
        System.out.println("Constructor from PoliceInspectorate");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

class Employee {
    String rank;
    String name;
    Integer age;
    String address;

    public Employee(String rank, String name, Integer age, String address) {
        this.rank = rank;
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("Constructor from Employee");
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String setName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
