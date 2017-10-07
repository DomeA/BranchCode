package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;


import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.CurrentTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface CurrentTypeRepository extends CrudRepository<CurrentTypeEntity, String> {
}
