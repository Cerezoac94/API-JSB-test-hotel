package com.codellege.hotel.services;

import com.codellege.hotel.models.HuespedModel;
import com.codellege.hotel.repositories.IHuespedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuespedServiceImpl implements IHuespedService<HuespedModel, Long>{
    @Autowired
    private IHuespedRepo huespedRepo;

    @Override
    public List<HuespedModel> findAll() {
        return huespedRepo.findAll();
    }

    @Override
    public HuespedModel save(HuespedModel huesped) {
        return huespedRepo.save(huesped);
    }

    @Override
    public HuespedModel update(long id, HuespedModel huesped) {
        huesped.setId(id);
        return huespedRepo.save(huesped);
    }

    @Override
    public void delete(long id) {
        try {
            huespedRepo.deleteById(id);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
