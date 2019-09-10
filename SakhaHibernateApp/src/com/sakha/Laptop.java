//package com.sakha;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//
//@Entity
//public class Laptop {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	int laptopId;
//	String brand;
//	
////	@ManyToMany(mappedBy="laptop")
//	@ManyToOne
////	List<Trainee> trainee=new ArrayList<Trainee>();
//	Trainee trainee;
//
//	public int getLaptopId() {
//		return laptopId;
//	}
//
//	public void setLaptopId(int laptopId) {
//		this.laptopId = laptopId;
//	}
//
//	public String getBrand() {
//		return brand;
//	}
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//	public Trainee gettList() {
//		return trainee;
//	}
//
//	public void settList(Trainee trainee) {
//		this.trainee =  trainee;
//	}
//
//	@Override
//	public String toString() {
//		return "Laptop [laptopId=" + laptopId + ", brand=" + brand +  ", getLaptopId()="
//				+ getLaptopId() + ", getBrand()=" + getBrand() + ", gettList()=" + gettList() + ", getClass()="
//				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}
//
//	public Laptop(int laptopId, String brand) {
//		super();
//		this.laptopId = laptopId;
//		this.brand = brand;
//		
//	}
//
//	public Laptop() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public void setTrainee(Trainee tr) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	
//	
//	
//
//}
