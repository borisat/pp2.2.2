package com.example.pp2.DAO;

import com.example.pp2.model.Car;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@Transactional
public interface CarDAO extends JpaRepository<Car, Integer> {

    }
