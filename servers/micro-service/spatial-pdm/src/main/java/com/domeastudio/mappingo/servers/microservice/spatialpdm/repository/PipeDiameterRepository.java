package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.PipeDiameterEntity;
import org.springframework.data.repository.CrudRepository;

public interface PipeDiameterRepository extends CrudRepository<PipeDiameterEntity, String> {
}
