package com.ram.lara.project.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ram.lara.project.entities.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer,Integer>{
	
	public Trainer findByUsername(String username);
	
	@Query(value="select * from trainer where id=:id",nativeQuery=true)
	public Trainer getTrainer(int id);
	
	

}
