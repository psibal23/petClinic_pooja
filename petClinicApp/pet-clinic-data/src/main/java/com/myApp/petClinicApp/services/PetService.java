package com.myApp.petClinicApp.services;

import java.util.Set;
import com.myApp.petClinicApp.model.Pet;

public interface PetService {

	Pet findById(Long id);
	  
	Pet save(Pet pet);
	  
	 Set<Pet> findAll();
}
