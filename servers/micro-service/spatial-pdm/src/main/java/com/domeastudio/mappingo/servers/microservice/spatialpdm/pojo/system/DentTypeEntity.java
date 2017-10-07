package com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "DentType", schema = "public", catalog = "postgres")
@Entity
public class DentTypeEntity implements Serializable {

    private String id;

    private Integer value;

    private String name;

    private FeatureTypeEntity featureTypeEntityById;

    @Id
    @GeneratedValue(generator = "autoid")
    @GenericGenerator(name = "autoid", strategy = "uuid")
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "value")
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne
    @JoinColumn(name = "feature_type_id", referencedColumnName = "id")
    public FeatureTypeEntity getFeatureTypeEntityById() {
        return featureTypeEntityById;
    }

    public void setFeatureTypeEntityById(FeatureTypeEntity featureTypeEntityById) {
        this.featureTypeEntityById = featureTypeEntityById;
    }
}
