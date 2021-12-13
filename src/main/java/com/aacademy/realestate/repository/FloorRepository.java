package com.aacademy.realestate.repository;

import com.aacademy.realestate.model.Floor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FloorRepository extends JpaRepository<Floor,Long> {  //podava se tipa na klasa i tipa id
    Optional<Floor> findByNumber(Integer number);

}
