package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.SystemMetaEntity;
import org.springframework.data.repository.CrudRepository;

public interface SystemMetaRepository extends CrudRepository<SystemMetaEntity, String> {
}
