package com.ram.lara.project.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.lara.project.entities.Trainer;
import com.ram.lara.project.entities.TrainerDTO;
import com.ram.lara.project.entities.TrainingPost;
import com.ram.lara.project.repositories.TrainerAssignmentRepository;
import com.ram.lara.project.securityconfigurer.MyResponse;
import com.ram.lara.project.services.TrainerService;

@RestController
@CrossOrigin
@RequestMapping(path="/trainer")
public class TrainerController {

	private Logger logger=LoggerFactory.getLogger(this.getClass());

	@Autowired
	private TrainerService trainerSer;
	@Autowired
	private TrainerAssignmentRepository trainerAssRepo;
	
	@GetMapping
	public MyResponse login()
	{
		System.out.println("adding some lines for check git");
		System.out.println("checking 2nd time");
		return new MyResponse("success");
		
	}
	@GetMapping("/get/{id}")
	private Trainer getTrainer(@PathVariable int id)
	{
		return trainerSer.getTrainer(id);
	}
	@GetMapping("/findtrainer/{username}")
	public TrainerDTO getTrainerByUsername(@PathVariable String username)
	{
	    logger.info("get trainer method is executing user name is "+username);
	   // System.out.println(trainerSer.findByUserName(username));
	    //System.out.println("getting mail id "+trainerSer.findByUserName(username).getEmail());
		return trainerSer.getTrainerFullDetails(username);
	}
	
	@PostMapping("/save")
	public Trainer saveTrainer(@RequestBody Trainer trainer)
	{
		logger.info("trainer is saving");
		trainerSer.saveTrainer(trainer);
		return trainer;
	}
	@GetMapping("/posts")
    public List<TrainingPost> getAllOrganizationPosts()
    {
    	return trainerSer.getAllTrainingPosts();
    }
	@GetMapping("/check/{username}")
	public MyResponse checkUserName(@PathVariable String username)
	{
		return trainerSer.checkUserName(username);
	}
	

}
