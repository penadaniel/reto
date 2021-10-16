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
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
@Service
public class ServiciosSpecialty implements Serializable{
    @Autowired
    private RepositorioSpecialty metodosCrud;
    
    public List<Specialty> getAll(){
         return metodosCrud.getAll();
    }
    
    public Optional<Specialty> getSpecialty(int idSpecialty){
        return metodosCrud.getSpecialty(idSpecialty);
    }
    
    
    public Specialty save(Specialty specialty){
        if(specialty.getIdSpecialty()==null){
            return metodosCrud.save(specialty);
        }else{
            Optional<Specialty> evt=metodosCrud.getSpecialty(specialty.getIdSpecialty());
            if(!evt.isPresent()){
            return metodosCrud.save(specialty);
            }else{
                return specialty;
            }
        
        
        }
    }
    
}
