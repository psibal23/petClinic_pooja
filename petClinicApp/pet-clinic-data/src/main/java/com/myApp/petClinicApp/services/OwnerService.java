package com.myApp.petClinicApp.services;

import java.util.Set;

import com.myApp.petClinicApp.model.Owner;

public interface OwnerService {
  Owner findById(Long id);
  
  Owner findByLastName(String LastName);
  
  Owner save(Owner owner);
  
  Set<Owner> findAll();
}
