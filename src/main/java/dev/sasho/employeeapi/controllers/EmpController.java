package dev.sasho.employeeapi.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.sasho.employeeapi.entity.Employee;
import dev.sasho.employeeapi.service.EmployeeService;





@RestController
@RequestMapping("/api")
public class EmpController {
    
    private EmployeeService employeeService;

    public EmpController(EmployeeService employeeService) {this.employeeService = employeeService;}

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        
        return employeeService.getAllEmployees();
        
    }

    @GetMapping("/employees/{id}")
    public Employee getMethodName(@PathVariable int id) {
        
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/employees")
    public Employee save(@RequestBody Employee employee) {
        
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/employees/remove/{id}")
    public void deleteEmployeeById(@PathVariable int id) {
        employeeService.deleteEmployeeById(id);
    }
    
    @PutMapping("/employees")
    public Employee update(@RequestBody Employee employee) {
        
        
        return employeeService.saveEmployee(employee);
    }
    
}
