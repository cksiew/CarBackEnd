package com.packt.cardatabase.domain;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Owner {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ownerid;
	
	private String firstname;
	
	private String lastname;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="owner")
	@JsonIgnore
	private List<Car> cars;
	
	public Owner() {
	}
	
	
	public Owner(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.cars = new ArrayList<Car>();
	}


	public long getOwnerid() {
		return ownerid;
	}


	public void setOwnerid(long ownerid) {
		this.ownerid = ownerid;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public List<Car> getCars() {
		return cars;
	}


	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	
	
}
