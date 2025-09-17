package de.htwberlin.webtech;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;



/*
This Interface allows for CRUD-Operations +
By giving the Stickman-Class a owner variable, Spring is able to generate a findByOwner Method.
 This is only possible because of the Stickman-Class making Use of Naming-Conventions (having a Owner Variable).
 */


@Repository
public interface StickmanRepository extends CrudRepository<Stickman, Long> {
    List<Stickman> findByOwner(String owner); // NEU
}
