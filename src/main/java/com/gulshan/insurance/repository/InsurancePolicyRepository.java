package com.gulshan.insurance.repository;

import com.gulshan.insurance.dto.InsurancePolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Integer> {

}
