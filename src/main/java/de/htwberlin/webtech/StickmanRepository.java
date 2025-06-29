package de.htwberlin.webtech;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StickmanRepository extends CrudRepository<Stickman, Long> {
    List<Stickman> findByOwner(String owner); // NEU
}
