/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctor;

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
public class Servicios implements Serializable{
    @Autowired
    private Repositorio metodosCrud;
    
    public List<Doctor> getAll(){
        return metodosCrud.getAll();
    }
    public Optional<Doctor> getDoctor(int id){
        return metodosCrud.getDoctor(id);
    }
    public Doctor save(Doctor doctor){
        if(doctor.getId()==null){
            return metodosCrud.save(doctor);
        }else{
            Optional<Doctor> evt=metodosCrud.getDoctor(doctor.getId());
            if(!evt.isPresent()){
                return metodosCrud.save(doctor);
            }else{
            return doctor;
            }
        }
    }
}
