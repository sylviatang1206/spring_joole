package com.example.springjoole.repo;

import com.example.springjoole.domain.Fan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FanRepository extends CrudRepository<Fan, Integer> {

}
