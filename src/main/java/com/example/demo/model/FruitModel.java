package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FruitModel {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@Column(name="Fruit name")
private String fname;
private long cost;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public long getCost() {
	return cost;
}
public void setCost(long cost) {
	this.cost = cost;
}
public FruitModel(int id, String fname, long cost) {
	super();
	this.id = id;
	this.fname = fname;
	this.cost = cost;
}
public FruitModel() {
	super();
	// TODO Auto-generated constructor stub
}

}
