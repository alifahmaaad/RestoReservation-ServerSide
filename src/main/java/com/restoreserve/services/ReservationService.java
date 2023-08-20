package com.restoreserve.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restoreserve.model.entities.Reservation;
import com.restoreserve.model.repos.ReservationRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ReservationService {
    @Autowired
    private ReservationRepo reservationRepo;
    public Reservation create(Reservation reservation){
        return reservationRepo.save(reservation);
    }
    public Reservation getReservationById(Long id){
        return reservationRepo.findById(id).get();
    }
    public List<Reservation> getReservationByCustemerId(Long customer_id){
        return reservationRepo.findbyIdUser(customer_id);
    }
    public List<Reservation> getReservationByRestaurantId(Long restaurant_id){
        return reservationRepo.findbyIdRestaurant(restaurant_id);
    }
    public Reservation update(Reservation reservation){
        return reservationRepo.save(reservation);
    }
    public void deleteById(Long Id){
        reservationRepo.deleteById(Id);
    }
}