package com.example.prelab3.Controller;

import com.example.prelab3.Entity.Departments;
import com.example.prelab3.Repository.DepartmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/departments")
public class DepartmentsController {

    @Autowired
    DepartmentsRepository departmentsRepository;
    @GetMapping(value = {"/lista", ""})
    public String listar(Model model){

        List<Departments> listaDepa = departmentsRepository.findAll();

        model.addAttribute("lista", listaDepa);
        return "Eric/lista" ;
    }




}
