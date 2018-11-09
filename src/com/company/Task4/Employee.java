package com.company.Task4;

public class Employee {
    private String Name;
    private String Position;

    Employee(String name, String position)
    {
        Name=name;
        Position=position;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getName() {
        return Name;
    }
}
