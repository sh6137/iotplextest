package com.example.iotplextest.repository;

import com.example.iotplextest.domain.CommandCCC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CCCRepository extends JpaRepository<CommandCCC, Long> {

}
