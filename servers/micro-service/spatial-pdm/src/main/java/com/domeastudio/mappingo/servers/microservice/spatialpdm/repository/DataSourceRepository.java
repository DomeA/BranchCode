package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.DataSourceEntity;
import org.springframework.data.repository.CrudRepository;

public interface DataSourceRepository extends CrudRepository<DataSourceEntity, String> {

}
