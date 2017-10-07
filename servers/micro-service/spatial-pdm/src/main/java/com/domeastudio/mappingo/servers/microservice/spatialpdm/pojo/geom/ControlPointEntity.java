package com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.geom;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.*;
import com.vividsolutions.jts.geom.Point;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/**
 * 控制点
 */
@Table(name = "ControlPoint", schema = "public", catalog = "postgisdb")
@Entity
public class ControlPointEntity {

    private Long fid;
    private String eventID;
    @Type(type = "org.hibernate.spatial.GeometryType")
    private Point point;
    private Date effectiveFromDate;
    private Date effectiveToDate;
    private String groupEventID;
    private OperationalStatusEntity operationalStatusEntityById;
    private String originEventID;
    private String remarks;
    private String processFlag;
    private DataResolutionEntity dataResolutionEntityById;
    private Integer subType;
    private ControlPointTypeEntity controlPointTypeEntityById;
    private String postNumber;
    private Double station;
    private String stationSeriesEventID;
    private Double symbolRotation;
    private YesNoEntity verifiedIndById;
    private Double x;
    private Double y;
    private Double z;
    private CoodiPrecisionEntity coodiPrecisionEntityById;
    private DataSourceEntity dataSourceEntityById;

    public ControlPointEntity() {
        this.setEventId(UUID.randomUUID().toString().replace("-", ""));
    }

    @Id
    @GeneratedValue(generator = "incrementid")
    @GenericGenerator(name = "incrementid", strategy = "increment")
    @Column(name = "fid")
    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "event_id")
    public String getEventId() {
        return eventID;
    }

    public void setEventId(String eventID) {
        this.eventID = eventID;
    }

    @Basic
    @Column(name = "the_geom")
    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Basic
    @Column(name = "effective_from_date")
    public Date getEffectiveFromDate() {
        return effectiveFromDate;
    }

    public void setEffectiveFromDate(Date effectiveFromDate) {
        this.effectiveFromDate = effectiveFromDate;
    }

    @Basic
    @Column(name = "effective_to_date")
    public Date getEffectiveToDate() {
        return effectiveToDate;
    }

    public void setEffectiveToDate(Date effectiveToDate) {
        this.effectiveToDate = effectiveToDate;
    }

    @Basic
    @Column(name = "group_event_id")
    public String getGroupEventID() {
        return groupEventID;
    }

    public void setGroupEventID(String groupEventID) {
        this.groupEventID = groupEventID;
    }

    @OneToOne
    @JoinColumn(name = "operational_status_id", referencedColumnName = "id")
    public OperationalStatusEntity getOperationalStatusEntityById() {
        return operationalStatusEntityById;
    }

    public void setOperationalStatusEntityById(OperationalStatusEntity operationalStatusEntityById) {
        this.operationalStatusEntityById = operationalStatusEntityById;
    }

    @Basic
    @Column(name = "origin_event_id")
    public String getOriginEventID() {
        return originEventID;
    }

    public void setOriginEventID(String originEventID) {
        this.originEventID = originEventID;
    }

    @Basic
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "process_flag")
    public String getProcessFlag() {
        return processFlag;
    }

    public void setProcessFlag(String processFlag) {
        this.processFlag = processFlag;
    }

    @OneToOne
    @JoinColumn(name = "data_resolution_id", referencedColumnName = "id")
    public DataResolutionEntity getDataResolutionEntityById() {
        return dataResolutionEntityById;
    }

    public void setDataResolutionEntityById(DataResolutionEntity dataResolutionEntityById) {
        this.dataResolutionEntityById = dataResolutionEntityById;
    }

    @Basic
    @Column(name = "sub_type")
    public Integer getSubType() {
        return subType;
    }

    public void setSubType(Integer subType) {
        this.subType = subType;
    }

    @OneToOne
    @JoinColumn(name = "control_point_type_id", referencedColumnName = "id")
    public ControlPointTypeEntity getControlPointTypeEntityById() {
        return controlPointTypeEntityById;
    }

    public void setControlPointTypeEntityById(ControlPointTypeEntity controlPointTypeEntityById) {
        this.controlPointTypeEntityById = controlPointTypeEntityById;
    }

    @Basic
    @Column(name = "post_number")
    public String getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(String postNumber) {
        this.postNumber = postNumber;
    }

    @Basic
    @Column(name = "station")
    public Double getStation() {
        return station;
    }

    public void setStation(Double station) {
        this.station = station;
    }

    @Basic
    @Column(name = "station_series_event_id")
    public String getStationSeriesEventID() {
        return stationSeriesEventID;
    }

    public void setStationSeriesEventID(String stationSeriesEventID) {
        this.stationSeriesEventID = stationSeriesEventID;
    }

    @Basic
    @Column(name = "symbol_rotation")
    public Double getSymbolRotation() {
        return symbolRotation;
    }

    public void setSymbolRotation(Double symbolRotation) {
        this.symbolRotation = symbolRotation;
    }

    @OneToOne
    @JoinColumn(name = "verified_ind_id", referencedColumnName = "id")
    public YesNoEntity getVerifiedIndById() {
        return verifiedIndById;
    }

    public void setVerifiedIndById(YesNoEntity verifiedIndById) {
        this.verifiedIndById = verifiedIndById;
    }

    @Basic
    @Column(name = "x")
    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    @Basic
    @Column(name = "y")
    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    @Basic
    @Column(name = "z")
    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    @OneToOne
    @JoinColumn(name = "coordi_precision_id", referencedColumnName = "id")
    public CoodiPrecisionEntity getCoodiPrecisionEntityById() {
        return coodiPrecisionEntityById;
    }

    public void setCoodiPrecisionEntityById(CoodiPrecisionEntity coodiPrecisionEntityById) {
        this.coodiPrecisionEntityById = coodiPrecisionEntityById;
    }

    @OneToOne
    @JoinColumn(name = "data_source_id", referencedColumnName = "id")
    public DataSourceEntity getDataSourceEntityById() {
        return dataSourceEntityById;
    }

    public void setDataSourceEntityById(DataSourceEntity dataSourceEntityById) {
        this.dataSourceEntityById = dataSourceEntityById;
    }
}
