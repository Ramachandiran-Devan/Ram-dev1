package com.ram.lara.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.lara.project.entities.Skill;
import com.ram.lara.project.repositories.SkillRepository;

@Service
public class SkillService {
	@Autowired
	private SkillRepository skillRepo;
	
	public Skill saveSkill(Skill skill)
	{
		skillRepo.save(skill);
		return skill;
	}
	
	public List<Skill> getAllSkills()
	{
		List<Skill> skills=(List<Skill>)skillRepo.findAll();
		
		return skills;
	}

}
