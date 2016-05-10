package com.logos.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.logos.demo.dao.RoleDao;
import com.logos.demo.model.Person;
import com.logos.demo.model.Role;

@Repository
public class RoleDaoImpl extends BaseDaoImpl<Role,Short> implements RoleDao{

	public RoleDaoImpl() {
		super(Role.class);
	}
}
