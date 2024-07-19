import EmployeeDao.EmployeeDaoImpl;
import EmployeeDao.EmpolyeeDao;
import beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.management.InvalidApplicationException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        EmpolyeeDao empolyeeDao = context.getBean("empDao", EmployeeDaoImpl.class);

//        Employee employee = new Employee();
//        employee.setEmpId(102);
//        employee.setEmpName("Anuj");
//        employee.setEmpEmail("akash@gmail.com");
//        empolyeeDao.insert(employee);

//        Employee employee1 = new Employee();
//        employee1.setEmpId(103);
//        employee1.setEmpName("Anuj");
//        employee1.setEmpEmail("akash@gmail.com");
//        empolyeeDao.insert(employee1);

//        Employee employee = new Employee();
//        employee.setEmpId(103);
//        employee.setEmpName("Shubham");
//        employee.setEmpEmail("shubham@gmail.com");
//        empolyeeDao.update(employee);

//        empolyeeDao.delete(103);
//        Employee employee = empolyeeDao.getEmployee(101);
//        System.out.println(employee);

        List<Employee> employees = empolyeeDao.getAllEmployee();
        for(Employee e: employees){
            System.out.println(e);
        }
    }

}
