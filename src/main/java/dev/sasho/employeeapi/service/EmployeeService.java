package dev.sasho.employeeapi.service;

import java.util.List;
import dev.sasho.employeeapi.entity.Employee;

public interface EmployeeService {
    
   public List<Employee> getAllEmployees();

   public Employee getEmployeeById (Integer id);

   public Employee saveEmployee(Employee employee);

   public void deleteEmployeeById(Integer id);
}
