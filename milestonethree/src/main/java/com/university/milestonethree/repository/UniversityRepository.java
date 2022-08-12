package com.university.milestonethree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.milestonethree.entity.UniversityClass;

public interface UniversityRepository extends JpaRepository <UniversityClass, Integer> {

}
