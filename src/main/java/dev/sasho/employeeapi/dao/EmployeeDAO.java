package dev.sasho.employeeapi.dao;

import java.util.List;
import dev.sasho.employeeapi.entity.Employee;

public interface EmployeeDAO {
    

    public Employee getEmployeeById (Integer id);

    public List<Employee> getAllEmployees();

    public Employee saveEmployee(Employee employee);

    public void deleteEmployeeById(Integer id);

    
}
