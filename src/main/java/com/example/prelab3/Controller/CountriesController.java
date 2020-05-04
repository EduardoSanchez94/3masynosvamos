package com.example.prelab3.Controller;

import com.example.prelab3.Entity.countries;
import com.example.prelab3.Repository.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Lewis")
public class CountriesController {
    @Autowired
    CountryRepo countryrepo;
    @GetMapping("/lewis")
    public String listarcountry(Model model){
        List<countries> listaCountries = countryrepo.findAll();
        model.addAttribute("listacountries", listaCountries);
        return "Lewis/lewis";
    }
}
