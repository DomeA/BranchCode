package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.SoilTestResultsEntity;
import org.springframework.data.repository.CrudRepository;

public interface SoilTestResultsRepository extends CrudRepository<SoilTestResultsEntity, String> {
}
