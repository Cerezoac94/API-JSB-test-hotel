package com.codellege.hotel.controllers;

import com.codellege.hotel.models.HuespedModel;
import com.codellege.hotel.services.HuespedServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/huespedes")
public class HuespedController {
    @Autowired
    private HuespedServiceImpl huespedService;

    @GetMapping
    public List<HuespedModel> getAllGuests(){
        return huespedService.findAll();
    }

    @PostMapping
    public HuespedModel createGuest(@RequestBody HuespedModel huesped){
        return huespedService.save(huesped);
    }

    @PutMapping("{id}")
    public HuespedModel updateGuest(@RequestBody HuespedModel huesped, @PathVariable long id){
        return huespedService.update(id, huesped);
    }

    @DeleteMapping("{id}")
    public void deleteGuest(@PathVariable long id){
        huespedService.delete(id);
    }
}
