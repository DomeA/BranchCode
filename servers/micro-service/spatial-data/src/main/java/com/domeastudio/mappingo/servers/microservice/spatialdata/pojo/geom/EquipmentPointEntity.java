package com.domeastudio.mappingo.servers.microservice.spatialdata.pojo.geom;

import com.vividsolutions.jts.geom.Point;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "equipment_point", schema = "public", catalog = "postgisdb")
public class EquipmentPointEntity {
    private Long id;
    private String fid;
    @Type(type = "org.hibernate.spatial.GeometryType")
    private Point location;

    public EquipmentPointEntity() {
        this.setFid(UUID.randomUUID().toString().replace("-", ""));
    }

    @Id
    @GeneratedValue(generator = "incrementid")
    @GenericGenerator(name = "incrementid", strategy = "increment")
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "fid")
    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    @Column(name = "location")
    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
}
