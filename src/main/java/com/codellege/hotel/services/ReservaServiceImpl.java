package com.codellege.hotel.services;

import com.codellege.hotel.models.ReservaModel;
import com.codellege.hotel.repositories.IReservaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServiceImpl implements IReservaService<ReservaModel, Long>{
    @Autowired
    private IReservaRepo reservaRepo;

    @Override
    public List<ReservaModel> findAll() {
        return reservaRepo.findAll();
    }

    @Override
    public ReservaModel save(ReservaModel reserva) {
        return reservaRepo.save(reserva);
    }

    @Override
    public ReservaModel update(long id, ReservaModel reserva) {
        reserva.setId(id);
        return reservaRepo.save(reserva);
    }

    @Override
    public void delete(long id) {
        try {
            reservaRepo.deleteById(id);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
