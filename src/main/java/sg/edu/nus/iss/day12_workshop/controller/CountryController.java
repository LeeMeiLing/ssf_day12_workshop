package sg.edu.nus.iss.day12_workshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.day12_workshop.model.Country;
import sg.edu.nus.iss.day12_workshop.service.CountryService;

@Controller
@RequestMapping(path = {"/countries"})
public class CountryController {
    
    CountryService ctySvc; // no autowired coz never @Service

    public CountryController(){
        
        ctySvc = new CountryService();

    }

    // need to add jackson dependency
    @GetMapping(produces = {"application/xml"})
    public @ResponseBody List<Country> getAllCountries(){

        return ctySvc.getAllCountries();

    }

    @PostMapping
    public @ResponseBody Boolean createCountry(@RequestBody Country cty){

        return ctySvc.createCountry(cty);
        
    }

    @GetMapping("/list")
    public String displayCountryList(Model model){

        List<Country> ctyList = ctySvc.getAllCountries();
        model.addAttribute("countryList", ctyList);
        return "countryList";
    }

}
