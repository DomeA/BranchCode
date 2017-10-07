package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.ProjectTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProjectTypeRepository extends CrudRepository<ProjectTypeEntity, String> {
}
