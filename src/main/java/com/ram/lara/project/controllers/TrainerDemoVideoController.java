package com.ram.lara.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.lara.project.entities.TrainerDemoVideo;
import com.ram.lara.project.services.TrainerDemoVideoService;

@RestController
@CrossOrigin
@RequestMapping(path="/demo")
public class TrainerDemoVideoController {
	
	@Autowired
	private TrainerDemoVideoService trainerDemoVideoSer;
	
	@PostMapping
	public TrainerDemoVideo saveTrainerDemoVideo(@RequestBody TrainerDemoVideo trainerDemoVideo)
	{
		trainerDemoVideoSer.saveTrainerDemoVideo(trainerDemoVideo);;
		return trainerDemoVideo;
    }
	@GetMapping
	public List<TrainerDemoVideo> getAllTrainerDemoVideo()
	{
		return trainerDemoVideoSer.getAllDemoVideos();
	}
}
