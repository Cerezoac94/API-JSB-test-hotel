package com.codellege.hotel.repositories;

import com.codellege.hotel.models.HuespedModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHuespedRepo extends JpaRepository<HuespedModel, Long> {
}
