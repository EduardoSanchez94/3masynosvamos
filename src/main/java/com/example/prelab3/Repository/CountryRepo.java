package com.example.prelab3.Repository;

import com.example.prelab3.Entity.countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<countries, String> {
}
