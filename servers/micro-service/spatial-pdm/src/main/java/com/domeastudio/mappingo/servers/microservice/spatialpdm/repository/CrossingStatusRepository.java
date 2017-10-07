package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.CrossingStatusEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrossingStatusRepository extends CrudRepository<CrossingStatusEntity, String> {
}
