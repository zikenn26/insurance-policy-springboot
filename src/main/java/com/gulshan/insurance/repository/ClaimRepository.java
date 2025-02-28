package com.gulshan.insurance.repository;

import com.gulshan.insurance.dto.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ClaimRepository extends JpaRepository<Claim, Integer> {

}