package com.example.prelab3.Controller;

import com.example.prelab3.Entity.Jobs;
import com.example.prelab3.Repository.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Jobs")
public class JobsController {
    @Autowired
    JobsRepository jobsRepository;
    @GetMapping("")
    public String primera(){
        return "index";
    }
    @GetMapping("/lista")
    public String listaJobs(Model model){
        List<Jobs> lista = jobsRepository.findAll();
        model.addAttribute("lista",lista);
        return "Eduardo/lista";
    }
}
