package com.example.prelab3.Entity;

import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Departments {

    @Id
    @Column(name = "department_id", nullable = false)
    private int department_id;
    @Column(name = "department_name", nullable = false)
    private String department_name;
    @Column(name = "manager_id")
    private String managerId;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
    @Column(name = "department_short_name")
    private String departmentshortname;

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getDepartmentshortname() {
        return departmentshortname;
    }

    public void setDepartmentshortname(String departmentshortname) {
        this.departmentshortname = departmentshortname;
    }
}
