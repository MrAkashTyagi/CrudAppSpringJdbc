package beans;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    int empId;
    String empName;
    String empEmail;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                '}';
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public void display(){
        System.out.println("Employee Id : "+empId);
        System.out.println("Employee Name : "+empName);
        System.out.println("Employee Email : "+empEmail);
    }

}
