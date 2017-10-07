package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.MediumTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface MediumTypeRepository extends CrudRepository<MediumTypeEntity, String> {
}
