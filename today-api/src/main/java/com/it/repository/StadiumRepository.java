package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.entity.StadiumEntity;

public interface StadiumRepository extends JpaRepository<StadiumEntity, String >{

}
