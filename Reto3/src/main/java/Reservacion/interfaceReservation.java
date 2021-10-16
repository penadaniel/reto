/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reservacion;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USER
 */
public interface interfaceReservation extends CrudRepository<Reservation,Integer> {
    
}
