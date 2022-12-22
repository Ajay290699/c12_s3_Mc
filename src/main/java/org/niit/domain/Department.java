package org.niit.domain;


import org.springframework.stereotype.Component;

@Component
public class Department {

    private int departmentId;
    private String departmentName;

    public Department() {
        this.departmentId = 101;
        this.departmentName = "Information Technology";
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
