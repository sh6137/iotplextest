package com.example.iotplextest.repository;

import com.example.iotplextest.domain.CommandBBB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BBBRepository extends JpaRepository<CommandBBB, Long> {

}
