package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;


import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.InternalExternalEntity;
import org.springframework.data.repository.CrudRepository;

public interface InternalExternalRepository extends CrudRepository<InternalExternalEntity, String> {
}
