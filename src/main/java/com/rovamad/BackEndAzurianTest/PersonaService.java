package com.rovamad.BackEndAzurianTest;

import java.util.List;

public interface PersonaService {
    List<Persona>listar();
    Persona listarId(int id);
    Persona agregar(Persona p);
    Persona editar(Persona p);
    Persona borrar(int id);
}
