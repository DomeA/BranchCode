package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.RepstatusEntity;
import org.springframework.data.repository.CrudRepository;

public interface RepstatusRepository extends CrudRepository<RepstatusEntity, String> {
}
