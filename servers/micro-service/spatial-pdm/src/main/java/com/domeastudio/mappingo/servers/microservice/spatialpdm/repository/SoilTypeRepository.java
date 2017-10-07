package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.SoilTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface SoilTypeRepository extends CrudRepository<SoilTypeEntity, String> {
}
