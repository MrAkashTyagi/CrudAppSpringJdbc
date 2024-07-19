package EmployeeDao;

import beans.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.rmi.StubNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper <Employee>{
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setEmpId(rs.getInt(1));
        employee.setEmpName(rs.getString(2));
        employee.setEmpEmail(rs.getString(3));
        return employee;
    }
}
