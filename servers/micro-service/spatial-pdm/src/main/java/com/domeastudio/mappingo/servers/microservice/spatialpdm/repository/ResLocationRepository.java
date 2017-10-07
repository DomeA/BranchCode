package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.ResLocationEntity;
import org.springframework.data.repository.CrudRepository;

public interface ResLocationRepository extends CrudRepository<ResLocationEntity, String> {
}
