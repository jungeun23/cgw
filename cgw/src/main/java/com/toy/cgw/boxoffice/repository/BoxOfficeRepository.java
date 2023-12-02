package com.toy.cgw.boxoffice.repository;

import com.toy.cgw.boxoffice.entity.BoxOffice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoxOfficeRepository extends JpaRepository<BoxOffice,Long > {
}
