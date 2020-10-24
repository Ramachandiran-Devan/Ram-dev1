package com.ram.lara.project.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ram.lara.project.entities.Organization;

public interface OrganizationRepository extends CrudRepository<Organization,Integer>{
	
	public Organization findByUsername(String username);
	public Organization findByOrganizationName(String orgname);

}
