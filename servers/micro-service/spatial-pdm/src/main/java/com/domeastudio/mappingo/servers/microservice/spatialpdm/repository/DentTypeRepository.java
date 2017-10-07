package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.DentTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface DentTypeRepository extends CrudRepository<DentTypeEntity, String> {
}
