package com.tecsup.petclinic.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.exception.OwnerNotFoundException;
import com.tecsup.petclinic.repositories.OwnerRepository;

@Service
public class OwnerServiceImpl implements OwnerService {

	private static final Logger logger = LoggerFactory.getLogger(OwnerServiceImpl.class);

	@Autowired
	OwnerRepository ownerRepository;

	/**
	 * 
	 * @param pet
	 * @return
	 */
	@Override
	public Owner create(Owner owner) {
		return ownerRepository.save(owner);
	}

	/**
	 * 
	 * @param pet
	 * @return
	 */
	@Override
	public Owner update(Owner owner) {
		return ownerRepository.save(owner);

	}
	/**
	 * 
	 * @param id
	 * @throws PetNotFoundException
	 */
	@Override
	public void delete(Long id) throws OwnerNotFoundException{

		Owner owner = findById(id);
		ownerRepository.delete(owner);

	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Owner findById(long id) throws OwnerNotFoundException {

		Optional<Owner> owner = ownerRepository.findById(id);

		if ( !owner.isPresent())
			throw new OwnerNotFoundException("Record not found...!");
			
		return owner.get();
	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	public List<Owner> findByfist_name(String first_name) {

		List<Owner> owners = ownerRepository.findByfirst_name(first_name);

		owners.stream().forEach(owner -> logger.info("" + owner));

		return owners;
	}

	/**
	 * 
	 * @param typeId
	 * @return
	 */
	@Override
	public List<Owner> findBylast_name(String last_name) {

		List<Owner> owners = ownerRepository.findBylast_name(last_name);

		owners.stream().forEach(owner -> logger.info("" + owner));

		return owners;
	}

	/**
	 * 
	 * @param ownerId
	 * @return
	 */
	@Override
	public List<Owner> findByaddress(String address) {

		List<Owner> owners = ownerRepository.findByaddress(address);

		owners.stream().forEach(owner -> logger.info("" + owner));

		return owners;
	}

	/**
	 * 
	 * @param ownerId
	 * @return
	 */
	@Override
	public List<Owner> findBycity(String city) {

		List<Owner> owners = ownerRepository.findBycity(city);

		owners.stream().forEach(owner -> logger.info("" + owner));

		return owners;
	}

	/**
	 * 
	 * @param ownerId
	 * @return
	 */
	@Override
	public List<Owner> findBytelephone(String telephone) {

		List<Owner> owners = ownerRepository.findBytelephone(telephone);

		owners.stream().forEach(owner -> logger.info("" + owner));

		return owners;
	}

	/**
	 * 
	 * @param ownerId
	 * @return
	 */
	@Override
	public Iterable<Owner> findAll() {
		
		// TODO Auto-generated 
		return ownerRepository.findAll();
	
	}

	@Override
	public List<Owner> findByfirst_name(String first_name) {
		// TODO Auto-generated method stub
		return null;
	}
}