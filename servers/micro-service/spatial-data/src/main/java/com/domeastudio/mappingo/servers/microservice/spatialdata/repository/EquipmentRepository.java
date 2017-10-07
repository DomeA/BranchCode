package com.domeastudio.mappingo.servers.microservice.spatialdata.repository;

import com.domeastudio.mappingo.servers.microservice.spatialdata.pojo.geom.EquipmentPointEntity;
import org.springframework.data.repository.CrudRepository;

public interface EquipmentRepository extends CrudRepository<EquipmentPointEntity, Long> {
}
