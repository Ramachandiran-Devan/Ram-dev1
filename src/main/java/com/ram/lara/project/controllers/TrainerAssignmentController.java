package com.ram.lara.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.lara.project.entities.TrainerAssignment;
import com.ram.lara.project.services.TrainerAssignmentService;

@RestController
@CrossOrigin
@RequestMapping(path="/assignment")
public class TrainerAssignmentController {
	@Autowired
	private TrainerAssignmentService trainerAssSer;
	
	@PostMapping
	public TrainerAssignment saveAssignment(@RequestBody TrainerAssignment trainerAssignment)
	{
		System.out.println("the trainer assignment id is "+trainerAssignment);
		trainerAssSer.saveTrainerAssignment(trainerAssignment);
		return trainerAssignment;
	}
	@GetMapping
	public List<TrainerAssignment> getAllAssignments()
	{
		return trainerAssSer.getAllAssignments();
	}
	

}
