package com.ram.lara.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Organization 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String organizationName;
	private String address;
	private long landLineNumber;
	private String website;
	private String contactPersonName;
	private String contactPersonDesignation;
	private String contactPersonEmailId;
	private long contactPersonMobileNumber;
	private String organizationProfile;
	private String username;
	private String password;
	private String roles;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getLandLineNumber() {
		return landLineNumber;
	}
	public void setLandLineNumber(long landLineNumber) {
		this.landLineNumber = landLineNumber;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getContactPersonName() {
		return contactPersonName;
	}
	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}
	public String getContactPersonDesignation() {
		return contactPersonDesignation;
	}
	public void setContactPersonDesignation(String contactPersonDesignation) {
		this.contactPersonDesignation = contactPersonDesignation;
	}
	public String getContactPersonEmailId() {
		return contactPersonEmailId;
	}
	public void setContactPersonEmailId(String contactPersonEmailId) {
		this.contactPersonEmailId = contactPersonEmailId;
	}
	public long getContactPersonMobileNumber() {
		return contactPersonMobileNumber;
	}
	public void setContactPersonMobileNumber(long contactPersonMobileNumber) {
		this.contactPersonMobileNumber = contactPersonMobileNumber;
	}
	public String getOrganizationProfile() {
		return organizationProfile;
	}
	public void setOrganizationProfile(String organizationProfile) {
		this.organizationProfile = organizationProfile;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((contactPersonDesignation == null) ? 0 : contactPersonDesignation.hashCode());
		result = prime * result + ((contactPersonEmailId == null) ? 0 : contactPersonEmailId.hashCode());
		result = prime * result + (int) (contactPersonMobileNumber ^ (contactPersonMobileNumber >>> 32));
		result = prime * result + ((contactPersonName == null) ? 0 : contactPersonName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (int) (landLineNumber ^ (landLineNumber >>> 32));
		result = prime * result + ((organizationName == null) ? 0 : organizationName.hashCode());
		result = prime * result + ((organizationProfile == null) ? 0 : organizationProfile.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((website == null) ? 0 : website.hashCode());
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
		Organization other = (Organization) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (contactPersonDesignation == null) {
			if (other.contactPersonDesignation != null)
				return false;
		} else if (!contactPersonDesignation.equals(other.contactPersonDesignation))
			return false;
		if (contactPersonEmailId == null) {
			if (other.contactPersonEmailId != null)
				return false;
		} else if (!contactPersonEmailId.equals(other.contactPersonEmailId))
			return false;
		if (contactPersonMobileNumber != other.contactPersonMobileNumber)
			return false;
		if (contactPersonName == null) {
			if (other.contactPersonName != null)
				return false;
		} else if (!contactPersonName.equals(other.contactPersonName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (landLineNumber != other.landLineNumber)
			return false;
		if (organizationName == null) {
			if (other.organizationName != null)
				return false;
		} else if (!organizationName.equals(other.organizationName))
			return false;
		if (organizationProfile == null) {
			if (other.organizationProfile != null)
				return false;
		} else if (!organizationProfile.equals(other.organizationProfile))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (website == null) {
			if (other.website != null)
				return false;
		} else if (!website.equals(other.website))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Organization [id=" + id + ", organizationName=" + organizationName + ", address=" + address
				+ ", landLineNumber=" + landLineNumber + ", website=" + website + ", contactPersonName="
				+ contactPersonName + ", contactPersonDesignation=" + contactPersonDesignation
				+ ", contactPersonEmailId=" + contactPersonEmailId + ", contactPersonMobileNumber="
				+ contactPersonMobileNumber + ", organizationProfile=" + organizationProfile + ", username=" + username
				+ ", password=" + password + ", roles=" + roles + "]";
	}
	
}
/*
 * Table_name: Organization
Id: Number => PK
Name:
Address:
Land_line_number:
Website:
Contact_person_name:
Contact_person_designation:
Contact_person_email_id:
Contact_person_mobile_number:
Organization_profile: varchar2
Username:
Password:
 */
