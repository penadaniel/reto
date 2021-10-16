/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Especialidad;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository
public class RepositorioSpecialty implements Serializable{
    @Autowired
    private interfaceSpecialty crud;
    
    public List<Specialty> getAll(){
        return (List<Specialty>) crud.findAll();
    }
    public Optional <Specialty> getSpecialty(int id){
        return crud.findById(id);
    }
    
    public Specialty save(Specialty specialty){
        return crud.save(specialty);
    }
    
}
