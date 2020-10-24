package com.ram.lara.project.entities;

import java.util.ArrayList;
import java.util.List;

public class TrainerDTO {
	
	private Trainer trainer;
	private List<TrainerAssignment> trainerAssignment=new ArrayList<TrainerAssignment>();
	private List<TrainerDemoVideo> trainerDemoVideo=new ArrayList<TrainerDemoVideo>();
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	public List<TrainerAssignment> getTrainerAssignment() {
		return trainerAssignment;
	}
	public void setTrainerAssignment(List<TrainerAssignment> trainerAssignment) {
		this.trainerAssignment = trainerAssignment;
	}
	public List<TrainerDemoVideo> getTrainerDemoVideo() {
		return trainerDemoVideo;
	}
	public void setTrainerDemoVideo(List<TrainerDemoVideo> trainerDemoVideo) {
		this.trainerDemoVideo = trainerDemoVideo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trainer == null) ? 0 : trainer.hashCode());
		result = prime * result + ((trainerAssignment == null) ? 0 : trainerAssignment.hashCode());
		result = prime * result + ((trainerDemoVideo == null) ? 0 : trainerDemoVideo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrainerDTO other = (TrainerDTO) obj;
		if (trainer == null) {
			if (other.trainer != null)
				return false;
		} else if (!trainer.equals(other.trainer))
			return false;
		if (trainerAssignment == null) {
			if (other.trainerAssignment != null)
				return false;
		} else if (!trainerAssignment.equals(other.trainerAssignment))
			return false;
		if (trainerDemoVideo == null) {
			if (other.trainerDemoVideo != null)
				return false;
		} else if (!trainerDemoVideo.equals(other.trainerDemoVideo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TrainerDTO [trainer=" + trainer + ", trainerAssignment=" + trainerAssignment + ", trainerDemoVideo="
				+ trainerDemoVideo + "]";
	}
	

}
