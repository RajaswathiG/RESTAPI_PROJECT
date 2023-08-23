package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.FruitModel;

public interface FruitRepo extends JpaRepository<FruitModel, Integer>{

}
