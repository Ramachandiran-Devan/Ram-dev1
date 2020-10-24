package com.ram.lara.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.lara.project.entities.Skill;
import com.ram.lara.project.services.SkillService;

@RestController
@CrossOrigin
@RequestMapping(path="/skill")
public class SkillController {
	@Autowired
	private SkillService skillSer;
	
	@GetMapping
	public List<Skill> getAllSkills()
	{
		return(List<Skill>)skillSer.getAllSkills();
	}

}
