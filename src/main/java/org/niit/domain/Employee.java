package org.niit.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    private int employeeId;
    private String employeeName;
    private String city;
    private long employeePhone;
    private Department department;

    @Autowired
    public Employee(Department department) {
        this.employeeId=8147;
        this.employeeName="Ajay Chavan";
        this.city = "Navi Mumbai";
        this.employeePhone= 9988563240l;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(long employeePhone) {
        this.employeePhone = employeePhone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", city='" + city + '\'' +
                ", employeePhone=" + employeePhone +
                ", department=" + department +
                '}';
    }
}
