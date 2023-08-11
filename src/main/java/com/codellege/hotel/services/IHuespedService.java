package com.codellege.hotel.services;

import java.util.List;

public interface IHuespedService<HuespedModel, Short> {
    //get
    List<HuespedModel> findAll();

    //post
    HuespedModel save(HuespedModel huesped);

    //update
    HuespedModel update(long id, HuespedModel huesped);

    //delete
    void delete(long id);
}
