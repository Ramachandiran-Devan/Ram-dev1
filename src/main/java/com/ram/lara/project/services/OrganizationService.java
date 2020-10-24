package com.ram.lara.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ram.lara.project.entities.Organization;
import com.ram.lara.project.repositories.OrganizationRepository;
import com.ram.lara.project.securityconfigurer.MyResponse;

@Service
public class OrganizationService {
	
	@Autowired
	private OrganizationRepository orgRepo;
	
	public Organization saveOrgainization(Organization organization)
	{
		organization.setRoles("ROLE_ORGANIZATION");
		organization.setPassword(passwordEncoder2().encode(organization.getPassword()));
		orgRepo.save(organization);
		return organization;
	}
	public List<Organization> getOrganization()
	{
		return (List<Organization>)orgRepo.findAll();
	}
	public void deleteOrganization(int id)
	{
		orgRepo.deleteById(id);
	}
	public Organization getOrganizationByUserName(String username)
	{
		return orgRepo.findByUsername(username);
	}
	public Organization getOrganizationByOrgName(String orgname)
	{
		return orgRepo.findByOrganizationName(orgname);
	}
	public MyResponse checkOrganizatonAndUserName(String organizationName,String username)
	{
		String message=null;
		List<Organization> organizations=(List<Organization>)orgRepo.findAll();
		for(Organization org:organizations)
		{
			if(org.getOrganizationName().equals(organizationName) && org.getUsername().equals(username))
			{
				message="user-org taken";
				break;
			}
			else if(org.getOrganizationName().equals(organizationName) && !org.getUsername().equals(username))
			{
				message="org-taken";
				break;
			}
			else if(!org.getOrganizationName().equals(organizationName) && org.getUsername().equals(username))
			{
				message="user-taken";
				break;
			}
			else
			{
				message="valid";
			}
		}
		return new MyResponse(message);
	}

	
	@Bean
	public PasswordEncoder passwordEncoder2() {
	   return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

	
}
