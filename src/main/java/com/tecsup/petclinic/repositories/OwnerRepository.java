package com.tecsup.petclinic.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tecsup.petclinic.entities.Owner;


@Repository
public interface OwnerRepository 
	extends CrudRepository<Owner, Long> {

	// Fetch pets by name
	List<Owner> findByfirst_name(String first_name);

	// Fetch pets by typeId
	List<Owner> findBylast_name(String last_name);

	// Fetch pets by ownerId
	List<Owner> findByaddress(String address);
	
	// Fetch pets by ownerId
	List<Owner> findBycity(String city);
	// Fetch pets by ownerId
	List<Owner> findBytelephone(String telephone);

}
