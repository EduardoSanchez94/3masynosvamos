package com.example.prelab3.Controller;

import com.example.prelab3.Entity.Employee;
import com.example.prelab3.Entity.Jobs;
import com.example.prelab3.Repository.EmployeeRepository;
import com.example.prelab3.Repository.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

@RequestMapping("/Employee")
public class EmployeeController {
@Autowired
    EmployeeRepository employeeRepository;
    @GetMapping("")
    public String primera(){
        return "index";
    }
    @GetMapping("/listaEmployee")
    public String listaJobs(Model model){
        List<Employee> listaEmployee = employeeRepository.findAll();
        model.addAttribute("listaEmployee",listaEmployee);
        return "Gabriel/listaEmployee";
    }



    @GetMapping(value = {"/EmpleadoPais"})
    public String obtenerEmpleadosEnSuPais(Model model) {

        model.addAttribute("listaEmpleadosEnSuPais", employeeRepository.obtenerEmpleadosEnSuPais());
        return "Gabriel/EmpleadoPais";
    }

}
