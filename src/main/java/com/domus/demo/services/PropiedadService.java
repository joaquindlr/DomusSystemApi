package com.domus.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.domus.demo.models.PropiedadModel;
import com.domus.demo.repositories.PropiedadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropiedadService {
    @Autowired
    PropiedadRepository propiedadRepository;

    public ArrayList<PropiedadModel> getPropiedades() {
        return (ArrayList<PropiedadModel>) propiedadRepository.findAll();
    }

    public PropiedadModel savePropiedad(PropiedadModel propiedad) {
        return propiedadRepository.save(propiedad);
    }

    public Optional<PropiedadModel> getPropiedadPorId(Long id) {
        return propiedadRepository.findById(id);
    }
}
