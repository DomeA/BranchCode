package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.MarkerTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface MarkerTypeRepository extends CrudRepository<MarkerTypeEntity, String> {
}
