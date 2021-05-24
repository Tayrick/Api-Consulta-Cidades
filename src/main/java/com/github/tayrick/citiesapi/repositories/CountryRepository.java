package com.github.tayrick.citiesapi.repositories;

import com.github.tayrick.citiesapi.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
