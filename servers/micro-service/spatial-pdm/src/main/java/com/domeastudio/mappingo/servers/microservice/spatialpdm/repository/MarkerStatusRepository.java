package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.MarkerStatusEntity;
import org.springframework.data.repository.CrudRepository;

public interface MarkerStatusRepository extends CrudRepository<MarkerStatusEntity, String> {
}
