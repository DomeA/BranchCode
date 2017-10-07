package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.EvaluationResultsEntity;
import org.springframework.data.repository.CrudRepository;

public interface EvaluationResultsRepository extends CrudRepository<EvaluationResultsEntity, String> {
}
