package com.ram.lara.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TrainerDemoVideo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer trainerId;
	private Integer skill_id;
	private Integer videoType;
	private String videoUrl;
	private Integer duration;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(Integer trainerId) {
		this.trainerId = trainerId;
	}
	public Integer getSkill_id() {
		return skill_id;
	}
	public void setSkill_id(Integer skill_id) {
		this.skill_id = skill_id;
	}
	public Integer getVideoType() {
		return videoType;
	}
	public void setVideoType(Integer videoType) {
		this.videoType = videoType;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((skill_id == null) ? 0 : skill_id.hashCode());
		result = prime * result + ((trainerId == null) ? 0 : trainerId.hashCode());
		result = prime * result + ((videoType == null) ? 0 : videoType.hashCode());
		result = prime * result + ((videoUrl == null) ? 0 : videoUrl.hashCode());
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
		TrainerDemoVideo other = (TrainerDemoVideo) obj;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (skill_id == null) {
			if (other.skill_id != null)
				return false;
		} else if (!skill_id.equals(other.skill_id))
			return false;
		if (trainerId == null) {
			if (other.trainerId != null)
				return false;
		} else if (!trainerId.equals(other.trainerId))
			return false;
		if (videoType == null) {
			if (other.videoType != null)
				return false;
		} else if (!videoType.equals(other.videoType))
			return false;
		if (videoUrl == null) {
			if (other.videoUrl != null)
				return false;
		} else if (!videoUrl.equals(other.videoUrl))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TrainerDemoVideo [id=" + id + ", trainerId=" + trainerId + ", skill_id=" + skill_id + ", videoType="
				+ videoType + ", videoUrl=" + videoUrl + ", duration=" + duration + "]";
	}
	

}
