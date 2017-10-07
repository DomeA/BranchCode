package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.DisturbanceEntity;
import org.springframework.data.repository.CrudRepository;

public interface DisturbanceRepository extends CrudRepository<DisturbanceEntity, String> {
}
