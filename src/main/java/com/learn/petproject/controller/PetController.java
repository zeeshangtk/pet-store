package com.learn.petproject.controller;

import com.learn.petproject.domain.Pet;
import com.learn.petproject.repo.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/pets")
public class PetController {
    @Autowired
    private PetRepo petRepo;

    @PostMapping(path = "/")
    public @ResponseBody Pet add(@RequestBody Pet pet) {
        return new ResponseEntity<>(petRepo.save(pet), HttpStatus.OK).getBody();
    }

    @GetMapping(path = "/")
    public @ResponseBody Iterable<Pet> getPets() {
        return new ResponseEntity<>(petRepo.findAll(), HttpStatus.OK).getBody();
    }
}
