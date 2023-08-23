package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VegetableModel {
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private int id;
 @Column(name="Vegetable Name")
 private String vname;
 private long cost;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getVname() {
	return vname;
}
public void setVname(String vname) {
	this.vname = vname;
}
public long getCost() {
	return cost;
}
public void setCost(long cost) {
	this.cost = cost;
}
public VegetableModel(int id, String vname, long cost) {
	super();
	this.id = id;
	this.vname = vname;
	this.cost = cost;
}
public VegetableModel() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
