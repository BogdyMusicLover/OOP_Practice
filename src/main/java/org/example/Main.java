package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeesFromPoliceStation10 = new ArrayList<>();
        Employee commander = new Employee("commander", "Marius", 40, "Bucuresti");
        employeesFromPoliceStation10.add(commander);

        List<Department> departments = new ArrayList<>();
        Department managementDepartment = new Department("management department");
        departments.add(managementDepartment);


        PoliceStation policeStation10 = new PoliceStation(
                "Sectia 10 Politie",
                "Bucuresti, str. Valeriu Braniste, nr.9, sector 3",
                employeesFromPoliceStation10,
                departments
        );


        System.out.println(PoliceStation.numberOfPoliceStation);

        PoliceStation policeStation11 = new PoliceStation(
                "Sectia 11 Politie",
                "Bucuresti",
                employeesFromPoliceStation10,
                departments
        );
        System.out.println(PoliceStation.numberOfPoliceStation);



    }
}