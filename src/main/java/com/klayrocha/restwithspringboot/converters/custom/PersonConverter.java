package com.klayrocha.restwithspringboot.converters.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.klayrocha.restwithspringboot.data.model.Person;
import com.klayrocha.restwithspringboot.data.vo.v2.PersonVO;

@Service
public class PersonConverter {
	
	public PersonVO convertEntityToVO(Person person) {
		PersonVO vo = new PersonVO();
		vo.setId(person.getId());
		vo.setAddress(person.getAddress());
		vo.setBirthDay(new Date());
		vo.setFirstName(person.getFirstName());
		vo.setLastName(person.getLastName());
		vo.setGender(person.getGender());
		return vo;
	}	
	
	public Person convertVOToEntity(PersonVO person) {
		Person entity = new Person();
		entity.setId(person.getId());
		entity.setAddress(person.getAddress());
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setGender(person.getGender());
		return entity;
	}

}