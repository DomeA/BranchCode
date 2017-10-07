package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.LandUseTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface LandUseTypeRepository extends CrudRepository<LandUseTypeEntity, String> {
}
