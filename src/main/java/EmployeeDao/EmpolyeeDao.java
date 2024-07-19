package EmployeeDao;

import beans.Employee;

import java.util.List;

public interface EmpolyeeDao {

    public int insert(Employee employee);
    public int update(Employee employee);
    public int delete(int empId);
    public Employee getEmployee(int empId);
     public List<Employee> getAllEmployee();

}
