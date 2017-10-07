package com.domeastudio.mappingo.servers.microservice.spatialpdm.repository;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.IntegrityProposalEntity;
import org.springframework.data.repository.CrudRepository;

public interface IntegrityProposalRepository extends CrudRepository<IntegrityProposalEntity, String> {
}
