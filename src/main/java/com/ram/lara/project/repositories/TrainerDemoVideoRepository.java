package com.ram.lara.project.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ram.lara.project.entities.TrainerDemoVideo;

public interface TrainerDemoVideoRepository extends CrudRepository<TrainerDemoVideo,Integer>{

	public List<TrainerDemoVideo> findAllByTrainerId(Integer id);
}
