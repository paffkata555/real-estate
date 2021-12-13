package com.aacademy.realestate.service.impl;

import com.aacademy.realestate.model.Floor;
import com.aacademy.realestate.repository.FloorRepository;
import com.aacademy.realestate.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.SecondaryTable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class FloorServiceImpl implements FloorService {

    //injektvame

    private final FloorRepository floorRepository;

    @Autowired
    public FloorServiceImpl(FloorRepository floorRepository) {
        this.floorRepository = floorRepository;
    }

    //razpisvame metoda
    @Override
    public Set<Floor> findAll() {
        return new HashSet<>(floorRepository.findAll());
    }

    @Override
    public Floor save(Floor floor) {
        return null;
    }

    @Override
    public Floor findByNumber(Integer number) {
        return null;
    }

    @Override
    public Floor findById(Long id) {
        return null;
    }

    @Override
    public Floor update(Floor floor, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }



}
