package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.LifeCycleEntity;
import org.springframework.data.repository.CrudRepository;

public interface LifeCycleRepository extends CrudRepository<LifeCycleEntity, String> {
}
