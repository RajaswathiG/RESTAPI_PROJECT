package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FruitModel;
import com.example.demo.repository.FruitRepo;

@Service
public class FruitService {

 @Autowired
 FruitRepo fr;
 public FruitModel fruitinfo(FruitModel fs)
 {
	 return fr.save(fs);
 }
 public List<FruitModel> fruitdetails(List<FruitModel> fs)
 {
	 return (List<FruitModel>)fr.saveAll(fs);
 }
 public List<FruitModel> showfruit()
 {
	 return fr.findAll(); //get
 }
 public FruitModel changefruit(FruitModel fs)
 {
	 return fr.saveAndFlush(fs); //update
 }
 public String updatefinfo(int fid,FruitModel fs)
 {
 	fr.saveAndFlush(fs);
 	
 	if(fr.existsById(fid))
 	{
 		return "Updated successfully";
 	}
 	else
 	{
 		return "Invalid id";
 	}
 }
 public void deletefruit(FruitModel fs)
	{
		fr.delete(fs);
	}
//delete by id for pathvariable
	public void deletefid(int id)
	{
		fr.deleteById(id);
	}
	
	//delete by id for requestparam
	public void deletepfid(int id)
	{
		fr.deleteById(id);
	}
	
}
