package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;


import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.InspectionMethodEntity;
import org.springframework.data.repository.CrudRepository;

public interface InspectionMethodRepository extends CrudRepository<InspectionMethodEntity, String> {
}
