package com.fima.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fima.entity.Services;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Long> {

}
