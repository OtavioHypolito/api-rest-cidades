package com.github.otavioaugusto.countries.repositories;

import com.github.otavioaugusto.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
