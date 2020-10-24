package com.ram.lara.project.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ram.lara.project.entities.Organization;
import com.ram.lara.project.entities.Trainer;
import com.ram.lara.project.entities.TrainerAssignment;
import com.ram.lara.project.entities.TrainerDTO;
import com.ram.lara.project.entities.TrainerDemoVideo;
import com.ram.lara.project.entities.TrainingPost;
import com.ram.lara.project.repositories.OrganizationRepository;
import com.ram.lara.project.repositories.SkillRepository;
import com.ram.lara.project.repositories.TrainerAssignmentRepository;
import com.ram.lara.project.repositories.TrainerDemoVideoRepository;
import com.ram.lara.project.repositories.TrainerRepository;
import com.ram.lara.project.repositories.TrainingPostRepository;
import com.ram.lara.project.securityconfigurer.MyResponse;

@Service
public class TrainerService implements UserDetailsService{
	
	@Autowired
	private TrainerRepository trainerRepo;
	@Autowired
	private OrganizationRepository orgRepo;
	
	@Autowired
	private TrainingPostRepository trainingRepo;
	
	@Autowired
	private SkillRepository skillRepo;
	
	@Autowired
	private TrainerAssignmentRepository trainAssRepo;
	
	@Autowired
	private TrainerDemoVideoRepository trainDemoVideoRepo;
	
	
	
	public Trainer saveTrainer(Trainer trainer)
	{
		trainer.setRoles("ROLE_TRAINER");
		trainer.setPassword(passwordEncoder1().encode(trainer.getPassword()));
		trainerRepo.save(trainer);
		return trainer;
	}
	public Trainer getTrainer(int id)
	{
		Trainer trainer=(Trainer)trainerRepo.findById(id).get();
		return trainer;
	}
	public Trainer findByUserName(String username)
	{
		Trainer trainer=(Trainer)trainerRepo.findByUsername(username);
		return trainer;
	}
	public TrainerDTO getTrainerFullDetails(String username)
	{
		Trainer trainer=trainerRepo.findByUsername(username);
		List<TrainerAssignment> trainerAssignments=(List<TrainerAssignment>)trainAssRepo.findAllByTrainerId(trainer.getId());
		List<TrainerDemoVideo> trainerDemoVideos=trainDemoVideoRepo.findAllByTrainerId(trainer.getId());
		
		TrainerDTO trainerFullDetails=new TrainerDTO();
		trainerFullDetails.setTrainer(trainer);
		if(trainerAssignments!=null)
		{
		trainerFullDetails.setTrainerAssignment(trainerAssignments);
		}
		if(trainerDemoVideos!=null)
		{
		trainerFullDetails.setTrainerDemoVideo(trainerDemoVideos);
		}
		return trainerFullDetails;
	}
	public List<Trainer> getAllTrainers()
	{
		List<Trainer> trainers=(List<Trainer>)trainerRepo.findAll();
		return trainers;
	}
	public List<TrainingPost> getAllTrainingPosts()
	{
		return (List<TrainingPost>)trainingRepo.findAllTrainingPostsFromDb();
	}
	public void deleteTrainer(int id)
	{
		trainerRepo.deleteById(id);
	}
	public MyResponse checkUserName(String username)
	{
		String message=null;
		List<Trainer> trainers=(List<Trainer>)trainerRepo.findAll();
		for(Trainer trainer:trainers)
		{
			if(trainer.getUsername().equals(username))
			{
				message="user-taken";
				break;
			}
			else
			{
				message="valid";
			}
			
		}
		return new MyResponse(message);
	}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Trainer trainer=(Trainer)trainerRepo.findByUsername(username);
		Organization organization=(Organization)orgRepo.findByUsername(username);
		if(trainer!=null && organization==null)
		{
		List<SimpleGrantedAuthority> roles= new ArrayList<SimpleGrantedAuthority>();
		roles.add(new SimpleGrantedAuthority(trainer.getRoles()));
		UserDetails user=new User(trainer.getUsername(),trainer.getPassword(),roles);
		return user;
		}
		else if(organization!=null && trainer==null)
		{
			List<SimpleGrantedAuthority> roles= new ArrayList<SimpleGrantedAuthority>();
			roles.add(new SimpleGrantedAuthority(organization.getRoles()));
			UserDetails user=new User(organization.getUsername(),organization.getPassword(),roles);
			return user;
		}
		else
		{
			return null;
		}
		
	}
	@Bean
	public PasswordEncoder passwordEncoder1() {
	   return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

}
