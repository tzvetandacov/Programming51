package com.hackbulgaria.programming51.week3;

public class Travel {
	public String country;
	public String city;
	
	public Travel(String country, String city){
		this.country = country;
		this.city = city;
	}
	
	public String toString(){
		return "country: " + country + " city: " + city;
	}
	public String getCity(){
		return this.city;
	}
	public String getCountery(){
		return this.country;
	}
	//public double getVAT(){
	//	return ;
	}


