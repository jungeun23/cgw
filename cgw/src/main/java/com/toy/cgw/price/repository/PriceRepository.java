package com.toy.cgw.price.repository;

import com.toy.cgw.price.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {
}
