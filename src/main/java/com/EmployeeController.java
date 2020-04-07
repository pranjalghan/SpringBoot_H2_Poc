package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/getAllEmployee")
    public Collection<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();

    }
    @RequestMapping("/getEmployee/{id}")
    public Employee getEmployee(@PathVariable Integer id){
        return employeeService.getEmployee(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/employee")
    public void addEmployee(@RequestBody Employee employee){
       employeeService.addEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/employee/{id}")
    public void updateEmployee(@RequestBody Employee employee,@PathVariable Integer id){
        employeeService.updateEmployee(id,employee);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/employee/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        employeeService.deleteEmployee(id);
    }


}
