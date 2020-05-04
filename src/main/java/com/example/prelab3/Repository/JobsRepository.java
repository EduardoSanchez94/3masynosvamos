package com.example.prelab3.Repository;

import com.example.prelab3.Entity.Jobs;
import com.example.prelab3.dtos.MayorSalarioDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobsRepository extends JpaRepository<Jobs,String> {



    @Query(value = "SELECT job_title as titulo,\n" +
            "min_salary as minimosalario,\n" +
            "max_salary as maximosalario\n" +
            " FROM jobs j where min_salary>?1",
        nativeQuery = true)
    List<MayorSalarioDto> obtenerListaEmpleadoMayorSueldo(int cantidad);


}
