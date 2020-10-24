package com.ram.lara.project.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ram.lara.project.entities.TrainerAssignment;

public interface TrainerAssignmentRepository extends CrudRepository<TrainerAssignment,Integer>{

	public List<TrainerAssignment> findAllByTrainerId(Integer id);
	
}
