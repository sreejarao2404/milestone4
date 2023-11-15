package com.Ambati.DMS.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Ambati.DMS.Models.Dog;
/**
 * 
 * @author s561636
 *
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);

}
