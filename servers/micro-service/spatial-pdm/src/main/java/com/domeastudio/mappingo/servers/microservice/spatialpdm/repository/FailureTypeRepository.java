package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.FailureTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface FailureTypeRepository extends CrudRepository<FailureTypeEntity, String> {
}
