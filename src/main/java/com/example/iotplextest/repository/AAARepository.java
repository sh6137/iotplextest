package com.example.iotplextest.repository;

import com.example.iotplextest.domain.CommandAAA;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AAARepository extends JpaRepository<CommandAAA, Long> {

}
