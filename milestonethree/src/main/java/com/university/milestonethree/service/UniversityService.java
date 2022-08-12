package com.university.milestonethree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.university.milestonethree.entity.UniversityClass;
import com.university.milestonethree.repository.UniversityRepository;

@Service
public class UniversityService {
	
	@Autowired
	private UniversityRepository repository;

	// to add the data
	public UniversityClass adddata(UniversityClass data) {
		return repository.save(data);
	}

	// to get the data based on id
	public UniversityClass getdataById(int id) {
		return repository.findById(id).orElse(null);
	}

	// to get all data
	public List<UniversityClass> getAlldata() {
		return repository.findAll();
	}


	// to edit the data
	public UniversityClass editdata(UniversityClass data) {
		UniversityClass ExistingData = repository.findById(data.getId()).orElse(null);
		ExistingData.setUniversityname(data.getUniversityname());
		ExistingData.setTotalclgs(data.getTotalclgs());
		return repository.save(ExistingData);
	}

	// to delete data
	public String deletedata(int id) {
		repository.deleteById(id);
		return "Data deleted";
	}
}