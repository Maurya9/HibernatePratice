package com.pack.FirstHibernateProgram;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class College {
	@Override
	public String toString() {
		return "College [Id=" + Id + ", Name=" + Name + ", City=" + City + "]";
	}
	@javax.persistence.Id
	private int Id;
	@Column
	private String Name;
	@Column
	private String City;
	public College(int id, String name, String city) {
		super();
		Id = id;
		Name = name;
		City = city;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}

}
