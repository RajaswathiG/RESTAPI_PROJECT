package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.VegetableModel;
import com.example.demo.service.VegetableService;

@RestController
public class VegetableController {
	@Autowired
	VegetableService vser;
	@PostMapping("addvegetable")
	public VegetableModel add(@RequestBody VegetableModel vs)
	{
		return vser.vegetableinfo(vs);
	}
    @PostMapping("addnvegetable")
    public List<VegetableModel> addndetails(@RequestBody List<VegetableModel> vs)
	{
		return vser.vegetabledetails(vs);
	}
    @GetMapping("vegetabledetails")
	public List<VegetableModel> show()
	{
		return vser.showvegetable();
	}
    @PutMapping("updatev")
    public VegetableModel modify(@RequestBody VegetableModel vs)
	{
		return vser.changevegetable(vs);
	}
    @DeleteMapping("deletevdetail")
	public String del(@RequestBody VegetableModel vs)
	{
		vser.deletevegetable(vs);
		return "Deleted successfully";
	}
	
	//PathVariable example
	@DeleteMapping("delvid/{id}")
	public void deletemyvid(@PathVariable int id)
	{
		vser.deletevid(id);
	}
	
	//RequestParam example
	@DeleteMapping("delvparamid")
	public void deletemyvparamid(@RequestParam int id)
	{
		vser.deletevid(id);
	}
    
}
