package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.FaultTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface FaultTypeRepository extends CrudRepository<FaultTypeEntity, String> {
}
