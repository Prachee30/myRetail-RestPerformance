package com.myRetail.repository;

import com.myRetail.model.CurrentPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICurrentPriceRepo extends JpaRepository<CurrentPrice,Integer> {
}
