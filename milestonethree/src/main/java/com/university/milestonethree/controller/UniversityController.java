package com.university.milestonethree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.university.milestonethree.service.*;
import com.university.milestonethree.entity.UniversityClass;

@RestController
public class UniversityController {
	@Autowired
	private UniversityService service;
	
	@GetMapping("/University/{id}")
	public UniversityClass getdataById(@PathVariable int id) {
		return service.getdataById(id);	
	}
	
	@GetMapping("/University")
	public List<UniversityClass> getdata(){
		return service.getAlldata();
	}
	
	
	@PostMapping("/University")
	public UniversityClass savedata(@RequestBody UniversityClass data) {	
		return service.adddata(data);	
	}
	
	@PutMapping("/University")
	public UniversityClass editdata(@RequestBody UniversityClass data) {
		return service.editdata(data);
	}
	
	@DeleteMapping("/University/{id}")
	public String deletedata(@PathVariable int id) {
		return service.deletedata(id);
	}


}