package com.example.prelab3.Repository;

import com.example.prelab3.Entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentsRepository extends JpaRepository <Departments, Integer> {
}
