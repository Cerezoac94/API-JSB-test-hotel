package com.codellege.hotel.repositories;

import com.codellege.hotel.models.ReservaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservaRepo extends JpaRepository<ReservaModel, Long> {
}
