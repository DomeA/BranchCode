package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.OperationalStatusEntity;
import org.springframework.data.repository.CrudRepository;

public interface OperationalStatusRepository extends CrudRepository<OperationalStatusEntity, String> {
}
