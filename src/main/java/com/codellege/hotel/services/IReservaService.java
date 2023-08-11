package com.codellege.hotel.services;

import java.util.List;

public interface IReservaService<ReservaModel, Long> {
    //get
    List<ReservaModel> findAll();

    //post
    ReservaModel save(ReservaModel reserva);

    //update
    ReservaModel update(long id, ReservaModel reserva);

    //delete
    void delete(long id);
}
