package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.AppurtenanceTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface AppurtenanceTypeRepository extends CrudRepository<AppurtenanceTypeEntity, String> {
}
