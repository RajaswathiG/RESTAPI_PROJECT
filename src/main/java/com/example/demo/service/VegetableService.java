package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.VegetableModel;
import com.example.demo.repository.VegetableRepo;

@Service
public class VegetableService {
 @Autowired
 VegetableRepo vr;
 public VegetableModel vegetableinfo(VegetableModel vs)
 {
	 return vr.save(vs);
 }
 public List<VegetableModel> vegetabledetails(List<VegetableModel> vs)
 {
	 return (List<VegetableModel>)vr.saveAll(vs);
 }
 public List<VegetableModel> showvegetable()
 {
	 return vr.findAll(); //get
 }
 public VegetableModel changevegetable(VegetableModel vs)
 {
	 return vr.saveAndFlush(vs); //update
 }
 public void deletevegetable(VegetableModel vs)
	{
		vr.delete(vs);
	}
//delete by id for pathvariable
	public void deletevid(int id)
	{
		vr.deleteById(id);
	}
	
	//delete by id for requestparam
	public void deletepvid(int id)
	{
		vr.deleteById(id);
	}
}
