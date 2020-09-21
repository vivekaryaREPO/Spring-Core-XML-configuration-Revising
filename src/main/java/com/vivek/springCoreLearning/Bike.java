package com.vivek.springCoreLearning;

public class Bike implements Vehicle {
	String bike;
	ObjectForConstructor ofcObject;
	public ObjectForConstructor getOfcObject() {
		return ofcObject;
	}
	public void setOfcObject(ObjectForConstructor ofcObject) {
		this.ofcObject = ofcObject;
		//this.bike=this.ofcObject.bikeName;
	}
	public Bike()
	{
		this.bike="No name";
	}
	public Bike(ObjectForConstructor ofc)
	{
		this.bike=ofc.bikeName;
	}
	public void drive()
	{
		System.out.println("Vehicle of Bike type "+this.bike);
	}
	public String getBike() {
		return bike;
	}
	public void setBike(String bike) {
		this.bike = bike;
	}

}
