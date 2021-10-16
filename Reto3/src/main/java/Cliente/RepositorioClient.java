/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;


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
public class RepositorioClient implements Serializable{
    @Autowired
    private interfaceClient crud;
    
    public List<Client> getAll(){
        return (List<Client>) crud.findAll();
        
    }
    public Optional<Client> getClient(int id){
        return crud.findById(id);
    }
    public Client save(Client client){
        return crud.save(client);
    }
    
}
