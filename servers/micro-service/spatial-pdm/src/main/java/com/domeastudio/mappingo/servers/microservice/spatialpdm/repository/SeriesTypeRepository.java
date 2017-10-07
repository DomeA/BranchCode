package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.SeriesTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface SeriesTypeRepository extends CrudRepository<SeriesTypeEntity, String> {
}
