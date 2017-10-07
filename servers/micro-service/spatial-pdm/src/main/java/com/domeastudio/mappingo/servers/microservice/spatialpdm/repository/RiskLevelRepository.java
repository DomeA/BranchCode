package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.RiskLevelEntity;
import org.springframework.data.repository.CrudRepository;

public interface RiskLevelRepository extends CrudRepository<RiskLevelEntity, String> {
}
