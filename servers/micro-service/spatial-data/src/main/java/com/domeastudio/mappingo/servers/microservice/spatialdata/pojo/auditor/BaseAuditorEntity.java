package com.domeastudio.mappingo.servers.microservice.spatialdata.pojo.auditor;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BaseAuditorEntity {
    private Long version;
    private Date createDate;
    private String creatorId;
    private Date modifyDate;
    private String modifierId;

    @PrePersist
    public void prePersist(String creatorId) {
        this.creatorId = creatorId;
        this.modifierId = creatorId;
    }

    @PreUpdate
    public void preUpdate(String modifierId) {
        this.modifierId = modifierId;
    }

    @Version
    @Column(name = "version")
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @CreatedDate
    @Column(name = "create_time")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @CreatedBy
    @Column(name = "creator_id")
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    @LastModifiedDate
    @Column(name = "modify_time")
    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @LastModifiedBy
    @Column(name = "modifier_id")
    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }
}
