package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.PCMDCACEntity;
import org.springframework.data.repository.CrudRepository;

public interface PCMDCACRepository extends CrudRepository<PCMDCACEntity, String> {
}
