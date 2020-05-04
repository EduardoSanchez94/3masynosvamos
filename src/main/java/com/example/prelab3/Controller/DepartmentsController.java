package com.example.prelab3.Controller;

import com.example.prelab3.Entity.Departments;
import com.example.prelab3.Entity.Location;
import com.example.prelab3.Repository.DepartmentsRepository;
import com.example.prelab3.Repository.LocationRepository;
import com.example.prelab3.dtos.DepartamentosPorLocation;
import com.example.prelab3.dtos.DepartmentbyCountryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import java.util.List;

@Controller
@RequestMapping("/departments")
public class DepartmentsController {

    @Autowired
    DepartmentsRepository departmentsRepository;

    @Autowired
    LocationRepository locationRepository;

    @GetMapping(value = {"/lista", ""})
    public String listar(Model model){

        List<Departments> listaDepa = departmentsRepository.findAll();
        List<Location> listaLocation = locationRepository.findAll();
        model.addAttribute("listaLocation", listaLocation);
        model.addAttribute("lista", listaDepa);
        return "Eric/lista" ;}


    @PostMapping("buscarDepartment")
    public String buscarDepartment(Model model, @RequestParam("company") String company) {

        List<Departments> byDepartmentname = departmentsRepository.findByDepartmentname(company);

        model.addAttribute("lista", byDepartmentname);
        return "Eric/lista";
    }

    @PostMapping("cantidadDepartmentbyLocation")
    public String cantidadDepartment(Model model, @RequestParam("cantidad") String name){

        List<DepartamentosPorLocation> byDepaxLoca = departmentsRepository.findByDepaxLoca(name);
        model.addAttribute("cantidad", byDepaxLoca);

        return "Eric/cantidadDepartment";
    }

    @PostMapping("DepartmentbyCountry")
    public String DepartmentbyCountry(Model model, @RequestParam("name") String name){

        List<DepartmentbyCountryDto> DepaxLoca = departmentsRepository.findByDepartmentbyCountry(name);
        model.addAttribute("cantidad", DepaxLoca);

        return "Eric/DepartmentByCountry";
    }




}
