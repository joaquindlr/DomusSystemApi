package com.domus.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.domus.demo.models.PropiedadModel;
import com.domus.demo.services.PropiedadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "https://domus-system.vercel.app/", "http://localhost:3000/" })
@RestController
@RequestMapping("/propiedad")
public class PropiedadController {
    @Autowired
    PropiedadService propiedadService;

    @GetMapping()
    public ArrayList<PropiedadModel> getAllPropiedades() {
        return propiedadService.getPropiedades();
    }

    @PostMapping()
    public PropiedadModel createPropiedad(@RequestBody PropiedadModel propiedad) {
        return this.propiedadService.savePropiedad(propiedad);
    }

    @GetMapping("/{id}")
    public Optional<PropiedadModel> getPropiedadById(@PathVariable("id") Long id) {
        return this.propiedadService.getPropiedadPorId(id);
    }
}
