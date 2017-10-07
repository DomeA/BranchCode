package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.LineTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface LineTypeRepository extends CrudRepository<LineTypeEntity, String> {
}
