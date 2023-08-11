package com.codellege.hotel.controllers;

import com.codellege.hotel.models.ReservaModel;
import com.codellege.hotel.services.ReservaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/reservas")
public class ReservaController {
    @Autowired
    private ReservaServiceImpl reservaService;

    @GetMapping
    public List<ReservaModel> getAllReservations(){
        return reservaService.findAll();
    }

    @PostMapping
    public ReservaModel createReservation(@RequestBody ReservaModel reserva){
        return reservaService.save(reserva);
    }

    @PutMapping("{id}")
    public ReservaModel updateReservation(@RequestBody ReservaModel reserva, @PathVariable long id){
        return reservaService.update(id, reserva);
    }

    @DeleteMapping("{id}")
    public void deleteReservation(@PathVariable long id){
        reservaService.delete(id);
    }
}
