package me.dio.herosapi.repository;

import org.springframework.data.repository.CrudRepository;

import me.dio.herosapi.document.Heroes;

public interface HeroesRepository extends CrudRepository<Heroes, String> {

}
