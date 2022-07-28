package org.countries;

import java.util.ArrayList;

public class CountriesView {

	public void view(CountriesDTO countriesDTO) {

		
		System.out.println(countriesDTO.getCountry_id());
		System.out.println(countriesDTO.getCountry_name());
		System.out.println(countriesDTO.getRegion_id());
	}
	
	public void view(ArrayList<CountriesDTO> ar) {
		
		for(CountriesDTO countriesDTO: ar) {
			System.out.println(countriesDTO.getCountry_id());
			System.out.println(countriesDTO.getCountry_name());
			System.out.println(countriesDTO.getRegion_id());
		}
		
	}
	
	
}
