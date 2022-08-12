package com.university.milestonethree.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class UniversityClass {
	@Id
	private int id;
	private String universityname;
	private int totalclgs;

	

	public int getId() {
		
		return id;
		
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getUniversityname() {
		
		return universityname;
	}

	public int getTotalclgs() {
		
		return totalclgs;
	}

	public void setUniversityname(String universityname) {
		
		this.universityname = universityname;

		
	}

	public void setTotalclgs(int totalclgs) {
		
		this.totalclgs = totalclgs;

		
	}
	public UniversityClass(int id, String universityname, int totalclgs) {
		super();
		this.id = id;
		this.universityname = universityname;
		this.totalclgs = totalclgs;
	}
	public UniversityClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}