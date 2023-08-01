package com.example.iotplextest.repository;

import com.example.iotplextest.domain.CommandAAA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AAARepository extends JpaRepository<CommandAAA, Long> {

}
