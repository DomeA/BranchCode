package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.RegionCompanyEntity;
import org.springframework.data.repository.CrudRepository;

public interface RegionCompanyRepository extends CrudRepository<RegionCompanyEntity, String> {
}
