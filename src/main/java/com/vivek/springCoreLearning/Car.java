package com.vivek.springCoreLearning;

public class Car implements Vehicle {
	String car;
	ObjectForConstructor ofcObject;

	public ObjectForConstructor getOfcObject() {
		return ofcObject;
	}

	public void setOfcObject(ObjectForConstructor ofcObject) {
		this.ofcObject = ofcObject;
		//this.car=this.ofcObject.carName;
	}

	public Car()
	{
		this.car="No name";
	}
	
	public Car(ObjectForConstructor ofc)
	{
		this.car=ofc.carName;
	}
	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public void drive()
	{
		System.out.println("Vehicle of Car type "+this.car);
	}
	

}
