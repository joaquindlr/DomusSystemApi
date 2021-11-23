package com.domus.demo.repositories;

import java.util.ArrayList;

import com.domus.demo.models.PropiedadModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropiedadRepository extends CrudRepository<PropiedadModel, Long> {
    public abstract ArrayList<PropiedadModel> findById(long id);
}
