package com.cognizant.springlearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.SpringLearnApplication;

@RestController
public class CountryController {
	@Autowired
	public Country country;
	@Autowired
	public List<Country> countryList;
	
	@RequestMapping(value="/country",method=RequestMethod.GET)
	public String  getCountryIndia() {
		return country.toString();	
	}

	@RequestMapping(value="/countries")
	public String  getAllCountry() {
		return countryList.toString();	
	}

}
