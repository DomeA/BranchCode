package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.DetectionTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface DetectionTypeRepository extends CrudRepository<DetectionTypeEntity, String> {
}
