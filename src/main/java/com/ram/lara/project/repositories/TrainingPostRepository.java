package com.ram.lara.project.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ram.lara.project.entities.TrainingPost;

public interface TrainingPostRepository extends CrudRepository<TrainingPost,Integer>{

	public List<TrainingPost> findAllByOrganizationName(String organizationName);
	
	@Query(value="select * from training_post order by id desc",nativeQuery =true)
	public List<TrainingPost> findAllTrainingPostsFromDb();
}
