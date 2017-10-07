package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.FloodClassEntity;
import org.springframework.data.repository.CrudRepository;

public interface FloodClassRepository extends CrudRepository<FloodClassEntity, String> {
}
