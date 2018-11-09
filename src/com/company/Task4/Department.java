package com.company.Task4;
import java.util.*;

public class Department {

    private String Name;
    private List<Employee> employees;
    private DepartmentArchive Archive;

    Department(String name)
    {
        Name=name;
        employees = new ArrayList<>();
        Archive = new DepartmentArchive();
    }

    public class DepartmentArchive
    {
        private Map<String,List<String>> employeesArchive;

        DepartmentArchive(){
            employeesArchive = new HashMap<String,List<String>>();
        }

        void AddingEmp(Employee emp)
        {
            if (employeesArchive.containsKey(emp.getPosition()))
            {
                List<String> emps = new ArrayList<>(employeesArchive.get(emp.getPosition()));
                emps.add(emp.getName());
                employeesArchive.put(emp.getPosition(), emps);
            }
            else
            {
                employeesArchive.put(emp.getPosition(), Arrays.asList(emp.getName()));
            }
        }

        Set<String> getPositions()
        {
            return employeesArchive.keySet();
        }

        List<String> getByPosition(String pos)
        {
            return employeesArchive.get(pos);
        }

    }

    void Create(Employee emp) {
        employees.add(emp);
        Archive.AddingEmp(emp);
    }

    void Delete(int id) {
        employees.remove(id);
    }

    List<Employee> getEmployees()
    {
        return employees;
    }

    Set<String> getPositions()
    {
        return Archive.getPositions();
    }


    List<String> getByPosition(String pos)
    {
        return Archive.getByPosition(pos);
    }
}


