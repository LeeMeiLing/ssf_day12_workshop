package sg.edu.nus.iss.day12_workshop.service;

import java.util.List;

import sg.edu.nus.iss.day12_workshop.model.Country;
import sg.edu.nus.iss.day12_workshop.repository.CountryRepo;

// no @Service annotation
public class CountryService {
    
    CountryRepo ctyRepo;

    // use constructor, no autowired
    public CountryService(){
        ctyRepo = new CountryRepo();
    }

    public List<Country> getAllCountries(){

        return ctyRepo.getAllCountries();

    }

    public Boolean createCountry(Country cty){

        Boolean result = ctyRepo.createCountry(cty);
        return result;
        
    }
}
