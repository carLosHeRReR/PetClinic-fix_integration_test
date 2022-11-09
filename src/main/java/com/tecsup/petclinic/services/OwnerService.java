package com.tecsup.petclinic.services;

import java.util.List;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.exception.OwnerNotFoundException;

public interface OwnerService {

	/**
	 * 
	 * @param pet
	 * @return
	 */
	Owner create(Owner owner);

	/**
	 * 
	 * @param pet
	 * @return
	 */
	Owner update(Owner owner);

	/**
	 * 
	 * @param id
	 * @throws PetNotFoundException
	 */
	void delete(Long id) throws OwnerNotFoundException;

	/**
	 * 
	 * @param id
	 * @return
	 */
	Owner findById(long id) throws OwnerNotFoundException;

	/**
	 * 
	 * @param name
	 * @return
	 */
	List<Owner> findByfirst_name(String first_name);

	/**
	 * 
	 * @param typeId
	 * @return
	 */
	List<Owner> findBylast_name(String last_name);

	/**
	 * 
	 * @param ownerId
	 * @return
	 */
	List<Owner> findByaddress(String address);

	/**
	 * 
	 * @return
	 */
	List<Owner> findBycity(String city);

	/**
	 * 
	 * @param ownerId
	 * @return
	 */
	List<Owner> findBytelephone(String telephone);

	/**
	 * 
	 * @param ownerId
	 * @return
	 */
	Iterable<Owner> findAll();

}