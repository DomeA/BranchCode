package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.SheetTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface SheetTypeRepository extends CrudRepository<SheetTypeEntity, String> {
}
