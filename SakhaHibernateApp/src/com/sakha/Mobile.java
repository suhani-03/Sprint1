package com.sakha;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile {
	
	@Id
	int id;
	String brand;
	String model;
	
	@OneToMany
	Trainee trainee;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Trainee getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", model=" + model + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Mobile(int id, String brand, String model) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
	}

}
