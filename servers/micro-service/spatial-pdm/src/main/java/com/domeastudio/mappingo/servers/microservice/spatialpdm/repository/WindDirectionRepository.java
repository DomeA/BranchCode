package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.WindDirectionEntity;
import org.springframework.data.repository.CrudRepository;

public interface WindDirectionRepository extends CrudRepository<WindDirectionEntity, String> {
}
