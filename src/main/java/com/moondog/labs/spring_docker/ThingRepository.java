package com.moondog.labs.spring_docker;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ThingRepository extends CrudRepository<Thing, String> {
}
