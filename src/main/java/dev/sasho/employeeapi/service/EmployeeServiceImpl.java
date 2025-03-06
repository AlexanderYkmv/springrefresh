package dev.sasho.employeeapi.service;

import java.util.List;
import org.springframework.stereotype.Service;
import dev.sasho.employeeapi.dao.EmployeeDAO;
import dev.sasho.employeeapi.entity.Employee;
import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    
    private EmployeeDAO employeeDAO;


    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {this.employeeDAO = employeeDAO;}

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeDAO.getEmployeeById(id);
    }

    @Transactional
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeDAO.saveEmployee(employee);
    }

    @Transactional
    @Override
    public void deleteEmployeeById(Integer id) {
        employeeDAO.deleteEmployeeById(id);
    }
}
