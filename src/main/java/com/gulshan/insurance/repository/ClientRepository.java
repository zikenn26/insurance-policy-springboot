package com.gulshan.insurance.repository;

import com.gulshan.insurance.dto.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
