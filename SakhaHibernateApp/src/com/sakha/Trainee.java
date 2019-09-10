package com.sakha;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CollectionType;
import org.hibernate.cfg.Configuration;


@Entity
@NamedQuery(name="byName", query = "from Trainee where tName=:name")
public class Trainee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int tId;
	@Column(unique=true)
	String tName;
	@Column(nullable = false)
	int tAge;
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	
//	@ManyToMany(fetch=FetchType.EAGER)
////	@ElementCollection(fetch=FetchType.EAGER)
//	List<Laptop> laptop=new ArrayList<Laptop>();
//	
//	public List<Laptop> getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(List<Laptop> laptop) {
//		this.laptop = (List<Laptop>) laptop;
//	}
//
//	public List<Laptop> getMobile(){
//		return laptop;
//	}
//	
//	public void setMobile(List<Laptop> laptop) {
//		this.laptop = laptop;
//	}
	
	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public int gettAge() {
		return tAge;
	}

	public void settAge(int tAge) {
		this.tAge = tAge;
	}

	@Override
	public String toString() {
		return "Trainee [tId=" + tId + ", tName=" + tName + ", tAge=" + tAge + ", gettId()=" + gettId()
				+ ", gettName()=" + gettName() + ", gettAge()=" + gettAge() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Trainee(int tId, String tName, int tAge) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.tAge = tAge;
	}

	public Configuration setLaptop() {
		// TODO Auto-generated method stub
		return null;
	}


}
