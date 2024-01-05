package com.learn.petproject.repo;

import org.springframework.data.repository.CrudRepository;
import com.learn.petproject.domain.Pet;

public interface PetRepo extends CrudRepository<Pet, Integer> {
}
