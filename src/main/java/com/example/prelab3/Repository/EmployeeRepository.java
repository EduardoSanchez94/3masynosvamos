package com.example.prelab3.Repository;

import com.example.prelab3.Entity.Employee;
import com.example.prelab3.dtos.EmpleadoEnPais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String> {



    @Query(value = "SELECT e.first_name as 'primerNombre', e.last_name as 'apellido' , c.country_name as 'nombrepais'\n" +
            "FROM employees e\n" +
            "         INNER JOIN departments d ON e.department_id = d.department_id\n" +
            "         INNER JOIN locations l ON d.location_id = l.location_id\n" +
            "         INNER JOIN countries c ON l.country_id = c.country_id",nativeQuery = true)
    List<EmpleadoEnPais> obtenerEmpleadosEnSuPais();


}
