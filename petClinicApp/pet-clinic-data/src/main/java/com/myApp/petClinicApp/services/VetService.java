package com.myApp.petClinicApp.services;

import java.util.Set;

import com.myApp.petClinicApp.model.Vet;

public interface VetService {
	Vet findById(Long id);
	  
	Vet save(Vet vet);
	  
	 Set<Vet> findAll();

}
