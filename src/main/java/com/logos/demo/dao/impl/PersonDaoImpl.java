package com.logos.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.logos.demo.dao.PersonDao;
import com.logos.demo.model.Person;

@Repository
public class PersonDaoImpl extends BaseDaoImpl<Person, Long> implements PersonDao {

	public PersonDaoImpl() {
		super(Person.class);
	}

}
