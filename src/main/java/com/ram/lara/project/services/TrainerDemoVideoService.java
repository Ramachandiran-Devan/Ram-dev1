package com.ram.lara.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.lara.project.entities.TrainerDemoVideo;
import com.ram.lara.project.repositories.TrainerDemoVideoRepository;

@Service
public class TrainerDemoVideoService {
	
	@Autowired
	private TrainerDemoVideoRepository trainerDemoVideoRepo;
	
	public void saveTrainerDemoVideo(TrainerDemoVideo trainerDemoVideo) {
		trainerDemoVideoRepo.save(trainerDemoVideo);
		
	}
	public List<TrainerDemoVideo> getAllDemoVideos() {
		return (List<TrainerDemoVideo>)trainerDemoVideoRepo.findAll();
	}

}
