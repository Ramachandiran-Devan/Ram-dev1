package com.ram.lara.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.lara.project.entities.TrainingPost;
import com.ram.lara.project.repositories.TrainingPostRepository;

@Service
public class TrainingPostService {

	@Autowired
	private TrainingPostRepository trainingPostRepo;
	
	public TrainingPost saveTrainingPost(TrainingPost trainingpost)
	{
		trainingPostRepo.save(trainingpost);
		return trainingpost;
	}
	public List<TrainingPost> getAllPosts()
	{
		return (List<TrainingPost>)trainingPostRepo.findAll();
	}
	public List<TrainingPost> getAllTrainingPostByOrganizationName(String organizationName)
	{
		return (List<TrainingPost>)trainingPostRepo.findAllByOrganizationName(organizationName);
	}
	

}
