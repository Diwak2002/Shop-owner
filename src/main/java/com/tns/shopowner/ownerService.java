package com.tns.shopowner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ownerService
{
	@Autowired
	private ownerRepository repo;
	
	//Get all the records from the table
	public void insertRecord(Owner owner)
	{
		repo.save(owner);
	}
	
	//Show all the records from the table in database
	public List<Owner> getAllRecords()
	{
		return repo.findAll();
	}
	
	//Show specific record from the table in database
	public Owner getownerById(Integer id)
	{
		return repo.findById(id).orElse(null);
	}
	
	//Deleting the specific record from the table in database
	public void deleteowner(Integer id)
	
	{
		repo.deleteById(id);
	}
	
	//updating the existing record
	public void updateowner(Integer id,Owner updateowner)
	{
		Owner existingowner=repo.findById(id).orElse(null);
		if(existingowner!=null)
		{
			existingowner.setownerid(updateowner.getownerid());
			existingowner.setownername(updateowner.getownername());
			existingowner.setAddress(updateowner.getAddress());
			repo.save(existingowner);
		}
	}
	
	

}
