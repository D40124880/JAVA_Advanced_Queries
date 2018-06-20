package com.codingdojo.queries.repository;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.queries.models.Language;

public interface LanguageRepository extends CrudRepository<Language, Long> {

}
