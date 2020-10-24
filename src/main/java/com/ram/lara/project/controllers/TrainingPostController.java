package com.ram.lara.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.lara.project.entities.TrainingPost;
import com.ram.lara.project.services.TrainingPostService;

@RestController
@CrossOrigin
@RequestMapping(path="/trainingpost")
public class TrainingPostController {
	
	@Autowired
	private TrainingPostService trainingPostSer;
	
	@GetMapping
	public List<TrainingPost> getAllTrainingPosts()
	{
		return trainingPostSer.getAllPosts();
	}
	@PostMapping("/save")
	public TrainingPost saveTrainingPost(@RequestBody TrainingPost trainingpost)
	{
		System.out.println("training post value is"+trainingpost);
		return trainingPostSer.saveTrainingPost(trainingpost);
	}

}
