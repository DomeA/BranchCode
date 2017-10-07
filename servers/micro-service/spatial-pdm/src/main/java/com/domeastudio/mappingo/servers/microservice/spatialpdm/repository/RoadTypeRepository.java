package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.RoadTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoadTypeRepository extends CrudRepository<RoadTypeEntity, String> {
}
