package de.htwberlin.webtech;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StickmanRepository extends CrudRepository<Stickman, Long> {}
