package EmployeeDao;

import beans.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("empDao")
public class EmployeeDaoImpl implements EmpolyeeDao{


    @Autowired
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Employee employee) {

        String query = "insert into employee_data (emp_id, emp_name, emp_email) values(?,?,?)";
        int result = this.jdbcTemplate.update(query,employee.getEmpId(),employee.getEmpName(),employee.getEmpEmail());
        return result;
    }

    @Override
    public int update(Employee employee) {

        String query = "update employee_data set emp_name=?, emp_email=? where emp_id = ?";
        this.jdbcTemplate.update(query,employee.getEmpName(),employee.getEmpEmail(),employee.getEmpId());
        return 0;
    }

    @Override
    public int delete(int empId) {
        String query = "delete from employee_data where emp_id = ?";
        this.jdbcTemplate.update(query,empId);
        return 0;
    }

    @Override
    public Employee getEmployee(int empId) {
        String query = "select * from employee_data where emp_id = ?";
        RowMapper<Employee> rowMapper = new RowMapperImpl();
        Employee employee = this.jdbcTemplate.queryForObject(query,rowMapper, empId);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployee() {
        String query = "select * from employee_data";
        List<Employee> employees = this.jdbcTemplate.query(query,new RowMapperImpl());
        return employees;
    }
}
