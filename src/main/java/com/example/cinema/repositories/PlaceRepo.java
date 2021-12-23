package com.example.cinema.repositories;

import com.example.cinema.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PlaceRepo extends JpaRepository<Place,Long> {
}
