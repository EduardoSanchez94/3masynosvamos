package com.example.prelab3.Repository;

import com.example.prelab3.Entity.Departments;
import com.example.prelab3.dtos.DepartamentosPorLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentsRepository extends JpaRepository <Departments, Integer> {

    List<Departments> findByDepartmentname(String departmentname);


}
