package com.ram.lara.project.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class TrainerAssignment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer trainerId;
	private String OrganizationName;
	private Date startDate;
	private Integer Duration;
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
	public String getOrganizationName() {
		return OrganizationName;
	}
	public void setOrganizationName(String organizationName) {
		OrganizationName = organizationName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Integer getDuration() {
		return Duration;
	}
	public void setDuration(Integer duration) {
		Duration = duration;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Duration == null) ? 0 : Duration.hashCode());
		result = prime * result + ((OrganizationName == null) ? 0 : OrganizationName.hashCode());
		result = prime * result + ((trainerId == null) ? 0 : trainerId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
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
		TrainerAssignment other = (TrainerAssignment) obj;
		if (Duration == null) {
			if (other.Duration != null)
				return false;
		} else if (!Duration.equals(other.Duration))
			return false;
		if (OrganizationName == null) {
			if (other.OrganizationName != null)
				return false;
		} else if (!OrganizationName.equals(other.OrganizationName))
			return false;
		if (trainerId == null) {
			if (other.trainerId != null)
				return false;
		} else if (!trainerId.equals(other.trainerId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TrainerAssignment [id=" + id + ", trainerId=" + trainerId + ", OrganizationName=" + OrganizationName
				+ ", startDate=" + startDate + ", Duration=" + Duration + "]";
	}
	

}
