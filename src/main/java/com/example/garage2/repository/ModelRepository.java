package com.example.garage2.repository;

import com.example.garage2.entite.Voiture_model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Voiture_model,Long> {
}
