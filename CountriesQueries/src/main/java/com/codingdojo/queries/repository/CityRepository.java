package com.codingdojo.queries.repository;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.queries.models.City;

public interface CityRepository extends CrudRepository<City, Long> {

}
