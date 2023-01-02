package org.example;

import java.util.List;

public class PoliceStation extends PoliceInspectorate {
    private List<Department> departments;

    static int numberOfPoliceStation;

    public PoliceStation(String name, String address, List<Employee> employees, List<Department> departments) {
        super(name, address, employees);
        this.departments = departments;
        System.out.println("Constructor from PoliceStation");
        PoliceStation.numberOfPoliceStation += 1;
    }
}

class Department {
    String name;

    Integer nrOfEmployees;

    public Department(String name) {
        this.name = name;
        System.out.println("Constructor from department");
    }

}
