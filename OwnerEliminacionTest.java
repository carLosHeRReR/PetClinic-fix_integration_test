package com.tecsup.petclinic.services;

public class OwnerEliminacionTest {
	
	public void testDeleteOwner() {

		String FIRST_NAME = "Diego";
		String LAST_NAME = "Porras";
		String ADDRESS= "402 Martinete";
		String CITY= "Lima";
		int TELEPHONE= 123456789;

		Owner owner = new Owner(1,FIRST_NAME, LAST_NAME, ADDRESS, CITY, TELEPHONE);
		owner = ownerService.create(owner);
		logger.info("" + owner);

		try {
			ownerService.delete(owner.getId());
		} catch (OwnerNotFoundException e) {
			fail(e.getMessage());
		}
			
		try {
			ownerService.findById(owner.getId());
			fail("Owner id = " + owner.getId() + " has not delete");
		} catch (OwnerNotFoundException e) {
		} 				

	}

}
