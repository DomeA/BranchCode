package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.DaysOfWeekEntity;
import org.springframework.data.repository.CrudRepository;

public interface DaysOfWeekRepository extends CrudRepository<DaysOfWeekEntity, String> {
}
