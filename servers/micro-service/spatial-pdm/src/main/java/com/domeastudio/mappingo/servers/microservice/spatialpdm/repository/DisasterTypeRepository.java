package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.DisasterTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface DisasterTypeRepository extends CrudRepository<DisasterTypeEntity, String> {
}
