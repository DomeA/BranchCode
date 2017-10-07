package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;


import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, String> {
}
