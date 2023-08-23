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

import com.example.demo.model.FruitModel;
import com.example.demo.service.FruitService;

@RestController
public class FruitController {
	@Autowired
	FruitService fser;
	@PostMapping("addfruit")
	public FruitModel add(@RequestBody FruitModel fs)
	{
		return fser.fruitinfo(fs);
	}
    @PostMapping("addnfruit")
    public List<FruitModel> addndetails(@RequestBody List<FruitModel> fs)
	{
		return fser.fruitdetails(fs);
	}
    @GetMapping("fruitdetails")
	public List<FruitModel> show()
	{
		return fser.showfruit();
	}
    @PutMapping("updatef")
    public FruitModel modify(@RequestBody FruitModel fs)
	{
		return fser.changefruit(fs);
	}
    
    @PutMapping("updatefruit/{fid}")
	public String modifybyid(@PathVariable int fid,@RequestBody FruitModel fs)
	{
		return fser.updatefinfo(fid,fs);
	}
    
    @DeleteMapping("deletefdetail")
	public String del(@RequestBody FruitModel fs)
	{
		fser.deletefruit(fs);
		return "Deleted successfully";
	}
	
	//PathVariable example
	@DeleteMapping("delfid/{id}")
	public void deletemyfid(@PathVariable int id)
	{
		fser.deletefid(id);
	}
	
	//RequestParam example
	@DeleteMapping("delfparamid")
	public void deletemyfparamid(@RequestParam int id)
	{
		fser.deletefid(id);
	}
	
    
}
