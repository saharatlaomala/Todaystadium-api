package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.entity.PaymentsEntity;

public interface PaymentsRepository extends JpaRepository<PaymentsEntity, Integer> {

}
