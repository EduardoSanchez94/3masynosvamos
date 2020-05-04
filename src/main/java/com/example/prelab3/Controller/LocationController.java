package com.example.prelab3.Controller;

import com.example.prelab3.Entity.Location;
import com.example.prelab3.Repository.CountryRepo;
import com.example.prelab3.Repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class LocationController {

    @Autowired
    CountryRepo countryRepo;
    @Autowired
    LocationRepository locationRepository;

    public String lista(Model model) {

        List<Location> listaLocation = locationRepository.findAll();
        model.addAttribute("lista", listaLocation);
        return "Josue/lista";
    }
}
