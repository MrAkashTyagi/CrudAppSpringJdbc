import EmployeeDao.EmployeeDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Driver;

@Configuration
@ComponentScan(basePackages = "EmployeeDao")
public class SpringConfigFile {


    @Bean("ds")
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/Employee");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root");
        return driverManagerDataSource;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

//    @Bean("empDao")
//    public EmployeeDaoImpl getEmployeeDaoImpl(){
//        EmployeeDaoImpl  employeeDao = new EmployeeDaoImpl();
//        employeeDao.setJdbcTemplate(getTemplate());
//        return employeeDao;
//    }



}
