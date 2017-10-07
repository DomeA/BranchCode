package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.SoilMICEntity;
import org.springframework.data.repository.CrudRepository;

public interface SoilMICRepository extends CrudRepository<SoilMICEntity, String> {
}
