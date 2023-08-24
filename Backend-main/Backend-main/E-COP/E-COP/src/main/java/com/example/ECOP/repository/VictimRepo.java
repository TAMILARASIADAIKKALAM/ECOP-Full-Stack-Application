package com.example.ECOP.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ECOP.entity.Victim;

public interface VictimRepo extends JpaRepository<Victim,Integer>{

}
