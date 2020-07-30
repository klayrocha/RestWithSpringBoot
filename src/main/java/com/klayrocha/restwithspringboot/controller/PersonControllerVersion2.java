package com.klayrocha.restwithspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klayrocha.restwithspringboot.data.vo.v2.PersonVO;
import com.klayrocha.restwithspringboot.services.PersonServices;

@RestController
@RequestMapping("/person/v2")
public class PersonControllerVersion2 {

	
	@Autowired
	private PersonServices service;
	
	@PostMapping
	public PersonVO createV2(@RequestBody PersonVO person) {
		return service.createV2(person);
	}
}
