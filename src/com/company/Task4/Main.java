package com.company.Task4;
public class Main {

    public static void main(String[] args) {
        Department Depart = new Department("Java");
        Depart.Create(new Employee("Vasya","Teamlead"));
        Depart.Create(new Employee("Vanya","Developer"));
        Depart.Create(new Employee("Anya","Tester"));
        Depart.Create(new Employee("Pasha","UI"));
        Depart.Delete(1);
        Depart.getByPosition("Teamlead");
        for(String name : Depart.getByPosition("Teamlead")) {
            System.out.println(name);
        }
        System.out.println(" ");
        for(Employee emp : Depart.getEmployees()) {
            System.out.println(emp.getName());
        }
        System.out.println();
        for(String pos : Depart.getPositions())
        {
            System.out.println(pos);
        }
    }
}
