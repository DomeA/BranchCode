package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.EmergencyServiceEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmergencyServiceRepository extends CrudRepository<EmergencyServiceEntity, String> {
}
