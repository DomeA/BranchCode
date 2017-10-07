package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.SystemTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface SystemTypeRepository extends CrudRepository<SystemTypeEntity, String> {
}
