package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.GradeEntity;
import org.springframework.data.repository.CrudRepository;


public interface GradeRepository extends CrudRepository<GradeEntity, String> {
}
