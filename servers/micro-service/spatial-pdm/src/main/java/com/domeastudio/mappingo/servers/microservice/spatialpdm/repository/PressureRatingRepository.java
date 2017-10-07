package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.PressureRatingEntity;
import org.springframework.data.repository.CrudRepository;

public interface PressureRatingRepository extends CrudRepository<PressureRatingEntity, String> {
}
