package com.ram.lara.project.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ram.lara.project.entities.Skill;

public interface SkillRepository extends CrudRepository<Skill,Integer>{

}
