package com.example.iotplextest.repository;

import com.example.iotplextest.domain.CommandDDD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DDDRepository extends JpaRepository<CommandDDD, Long> {

}
