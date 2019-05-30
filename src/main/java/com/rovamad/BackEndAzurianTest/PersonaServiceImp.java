package com.rovamad.BackEndAzurianTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImp implements PersonaService{
    @Autowired
    private PersonaRepositorio repositorio;

    @Override
    public List<Persona> listar() {
        return repositorio.findAll();
    }

    @Override
    public Persona listarId(int id) {
        return repositorio.findOne(id);
    }

    @Override
    public Persona agregar(Persona p) {
        return repositorio.save(p);
    }

    @Override
    public Persona editar(Persona p) {
        return repositorio.save(p);
    }

    @Override
    public Persona borrar(int id) {
        Persona p =repositorio.findOne(id);
        if (p!=null) {
            repositorio.delete(p);
        }
        return p;
    }
}
