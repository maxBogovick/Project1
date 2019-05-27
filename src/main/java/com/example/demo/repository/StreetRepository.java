package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.StreetEntity;

@Repository
public interface StreetRepository extends JpaRepository<StreetEntity, Integer> {
}
