package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.DataStatusEntity;
import org.springframework.data.repository.CrudRepository;

public interface DataStatusRepository extends CrudRepository<DataStatusEntity, String> {
}
