package com.ram.lara.project.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Skill {
	@Id
	private Integer id;
	private String skillName;
	private String skillDesc;
	@ManyToMany(mappedBy="skills")
	@JsonIgnore
	private List<Trainer> trainers=new ArrayList<Trainer>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getSkillDesc() {
		return skillDesc;
	}
	public void setSkillDesc(String skillDesc) {
		this.skillDesc = skillDesc;
	}
	public List<Trainer> getTrainers() {
		return trainers;
	}
	public void setTrainers(List<Trainer> trainers) {
		this.trainers = trainers;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((skillDesc == null) ? 0 : skillDesc.hashCode());
		result = prime * result + ((skillName == null) ? 0 : skillName.hashCode());
		result = prime * result + ((trainers == null) ? 0 : trainers.hashCode());
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
		Skill other = (Skill) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (skillDesc == null) {
			if (other.skillDesc != null)
				return false;
		} else if (!skillDesc.equals(other.skillDesc))
			return false;
		if (skillName == null) {
			if (other.skillName != null)
				return false;
		} else if (!skillName.equals(other.skillName))
			return false;
		if (trainers == null) {
			if (other.trainers != null)
				return false;
		} else if (!trainers.equals(other.trainers))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Skill [id=" + id + ", skillName=" + skillName + ", skillDesc=" + skillDesc + ", trainers=" + trainers
				+ "]";
	}
	

}
