package com.example.demo.Repository;

import com.example.demo.model.MuridModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MuridRepository extends JpaRepository<MuridModel, Long> {

    List<MuridModel> findByNameContaining(String name);
}
