package com.ram.lara.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.lara.project.entities.Organization;
import com.ram.lara.project.entities.Trainer;
import com.ram.lara.project.securityconfigurer.MyResponse;
import com.ram.lara.project.services.OrganizationService;
import com.ram.lara.project.services.TrainerService;

@RestController
@CrossOrigin
@RequestMapping("/organization")
public class OrganizationController {
	@Autowired
	private OrganizationService orgService;
	
	@Autowired
	private TrainerService trainerService;
	@GetMapping
	public MyResponse test()
	{
		return new MyResponse("orgnization is working");
	}
	@PostMapping("/save")
	public Organization save(@RequestBody Organization organization)
	{
		orgService.saveOrgainization(organization);
		return organization;
	}
	@GetMapping("/get/{username}")
	public Organization getOrganizationByUserName(@PathVariable String username)
	{
		System.out.println("the user name is "+username);
		return orgService.getOrganizationByUserName(username);
	}
	@GetMapping("/getorg/{orgname}")
	public Organization getOrganizationByOrgName(@PathVariable String orgname)
	{
		System.out.println("the user name is "+orgname);
		return orgService.getOrganizationByOrgName(orgname);
	}
	@GetMapping("/get/trainers")
	public List<Trainer> getAllTrainers()
	{
		return trainerService.getAllTrainers();
	}
	
	@GetMapping("/check/{organizationName}/{username}")
	public MyResponse checkOrgUserValid(@PathVariable ("organizationName") String organizationName,@PathVariable ("username") String username)
	{
		System.out.println("organization name "+organizationName+" username"+username);
		return orgService.checkOrganizatonAndUserName(organizationName, username);
	}

}
