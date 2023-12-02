package com.toy.cgw.screening.repository;

import com.toy.cgw.screening.entity.Screening;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ScreeningRepository extends JpaRepository<Screening, Long > {
}
