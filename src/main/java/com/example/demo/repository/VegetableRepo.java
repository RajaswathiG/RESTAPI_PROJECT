package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.VegetableModel;

public interface VegetableRepo extends JpaRepository<VegetableModel, Integer> {

}
