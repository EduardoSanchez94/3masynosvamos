package com.example.prelab3.Entity;

import javax.persistence.*;
import java.text.spi.DateFormatSymbolsProvider;
import java.util.Date;


@Entity
@Table(name = "employees")
public class Employee {
    @Id
    private String employeeId;
    @Column(nullable=false)
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    @Column(nullable=false)
    private Date hireDate;
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Jobs jobs;
    private Float salary;
    private Float commissionPct;
    @ManyToOne
    @JoinColumn(name="manager_id")
    private Employee manager;


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Jobs getJobs() {
        return jobs;
    }

    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Float getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(Float commissionPct) {
        this.commissionPct = commissionPct;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}
