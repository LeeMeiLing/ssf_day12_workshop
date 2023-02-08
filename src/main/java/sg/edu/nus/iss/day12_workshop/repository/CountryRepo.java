package sg.edu.nus.iss.day12_workshop.repository;

import java.util.ArrayList;
import java.util.List;

import sg.edu.nus.iss.day12_workshop.model.Country;


// no @Repository annotation, using constructor to instantiate country

public class CountryRepo {
    
    List<Country> countryList;

    public List<Country> getAllCountries(){

        if(countryList == null){
            countryList = new ArrayList<>();
        }

        Country cty = new Country("SG", "Singapore", 6000000);
        countryList.add(cty);

        cty = new Country("MY", "Malaysia", 33000000);
        countryList.add(cty);

        cty = new Country("CN", "China", 1430000000);
        countryList.add(cty);
        
        cty = new Country("HK", "Hong Kong", 7000000);
        countryList.add(cty);

        return countryList;

    }

    public Boolean createCountry(Country cty){

        if (countryList == null) {
            countryList = new ArrayList<>();
        }

        countryList.add(cty);
        return true;
    }
}
