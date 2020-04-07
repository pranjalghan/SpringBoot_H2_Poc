package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

//    private List<Employee> employees =new ArrayList<>(Arrays.asList(new Employee(1,"Raj",1000f),
//            new Employee(2,"Rahul",5000f),
//            new Employee(3,"Sagnik",70000f)));

    public List<Employee> getAllEmployee(){
        List<Employee> employees=new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }

    public Employee getEmployee(Integer id) {
       return employeeRepository.findOne(id);
    }

    public void addEmployee(Employee employee)
    {
        employeeRepository.save(employee);
    }
    public void updateEmployee(Integer id, Employee employee) {
      employeeRepository.save(employee);
    }

    public void deleteEmployee(Integer id) {
        employeeRepository.delete(id);
    }
}

