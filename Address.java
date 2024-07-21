package com.example.Uni_one_one.example;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="address1")
public class Address 
{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int aid;
	String acity;
	String astreet;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAcity() {
		return acity;
	}
	public void setAcity(String acity) {
		this.acity = acity;
	}
	public String getAstreet() {
		return astreet;
	}
	public void setAstreet(String astreet) {
		this.astreet = astreet;
	}
	
	

}
