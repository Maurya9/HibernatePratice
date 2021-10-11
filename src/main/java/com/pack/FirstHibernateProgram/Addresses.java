package com.pack.FirstHibernateProgram;



import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
public class Addresses {
	@Id
	private int Addid;
	private String city;
	private String state;
	@Lob
	private byte[] image;
	
	@Temporal(TemporalType.DATE)
	private Date AddDate;
	public Addresses(int addid, String city, String state, byte[] image) {
		super();
		Addid = addid;
		this.city = city;
		this.state = state;
		this.image = image;
	}
	@Override
	public String toString() {
		return "Addresses [Addid=" + Addid + ", city=" + city + ", state=" + state + ", image=" + Arrays.toString(image)
				+ ", AddDate=" + AddDate + "]";
	}
	public Addresses(Date addDate) {
		super();
		AddDate = addDate;
	}
	public Date getAddDate() {
		return AddDate;
	}
	public void setAddDate(Date addDate) {
		AddDate = addDate;
	}
	public Addresses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAddid() {
		return Addid;
	}
	public void setAddid(int addid) {
		Addid = addid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	

}
