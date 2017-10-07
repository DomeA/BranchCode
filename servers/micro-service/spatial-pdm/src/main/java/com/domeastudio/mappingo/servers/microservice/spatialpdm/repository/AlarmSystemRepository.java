package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.AlarmSystemEntity;
import org.springframework.data.repository.CrudRepository;

public interface AlarmSystemRepository extends CrudRepository<AlarmSystemEntity, String> {
}
