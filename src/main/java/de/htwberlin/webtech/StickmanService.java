package de.htwberlin.webtech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


/*
This Service class, implements the Stickman Repository in order to enable the Filter-Function.
It also contains defines the necassary Methods for saving and returning the Stickman-Table.
 */


@Service
public class StickmanService {

    @Autowired
    private StickmanRepository repo;

    public Stickman save(Stickman stickman) {
        return repo.save(stickman);
    }

    public List<Stickman> getAll() {
        return StreamSupport
                .stream(repo.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }


    public Stickman getById(Long id) {
        return repo.findById(id).orElse(null);
    }
    public List<Stickman> getByOwner(String owner) { // NEU
        return repo.findByOwner(owner);
    }


}
