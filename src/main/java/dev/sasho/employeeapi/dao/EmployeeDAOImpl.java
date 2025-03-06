package dev.sasho.employeeapi.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import dev.sasho.employeeapi.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    

    @Override
    public Employee saveEmployee(Employee employee) {
        Employee emp = entityManager.merge(employee);
        return emp;
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {

       TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);
       List<Employee> employees = theQuery.getResultList();
       return employees;
    }

    @Override
    public void deleteEmployeeById(Integer id) {
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);
    }

}
