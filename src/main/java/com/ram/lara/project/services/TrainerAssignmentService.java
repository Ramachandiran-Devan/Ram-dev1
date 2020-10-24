package com.ram.lara.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.lara.project.entities.TrainerAssignment;
import com.ram.lara.project.repositories.TrainerAssignmentRepository;

@Service
public class TrainerAssignmentService {
	
	@Autowired
	private TrainerAssignmentRepository trainerAss;
	
	public void saveTrainerAssignment(TrainerAssignment trainerAssignment)
	{
		trainerAss.save(trainerAssignment);
	}
	public List<TrainerAssignment> getAllAssignments()
	{
		return (List<TrainerAssignment>) trainerAss.findAll();
	}

}
