package com.example.prelab3.Repository;

import com.example.prelab3.Entity.Departments;
import com.example.prelab3.dtos.DepartamentosPorLocation;
import com.example.prelab3.dtos.DepartmentbyCountryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.hibernate.loader.Loader.SELECT;

@Repository
public interface DepartmentsRepository extends JpaRepository <Departments, Integer> {

    List<Departments> findByDepartmentname(String departmentname);

    @Query(value= "SELECT count(d.location_id) as cantidadDepartment , l.street_address as nombrelocation  FROM departments d\n" +
            "inner join locations l on l.location_id = d.location_id\n" +
            "where l.street_address = ?1 ; ", nativeQuery=true)

    List<DepartamentosPorLocation> findByDepaxLoca(String locationname);

    @Query(value= "SELECT d.department_name as nombredepartamento, c.country_name as nombrecountry  FROM departments d\n" +
            "inner join locations l on d.location_id = l.location_id\n" +
            "inner join countries c on l.country_id = c.country_id\n" +
            "where c.country_name LIKE ?1 ; ", nativeQuery=true)
    List<DepartmentbyCountryDto> findByDepartmentbyCountry(String name);
}
