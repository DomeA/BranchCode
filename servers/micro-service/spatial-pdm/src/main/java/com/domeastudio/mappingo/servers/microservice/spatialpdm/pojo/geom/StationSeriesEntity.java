package com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.geom;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.DataResolutionEntity;
import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.OperationalStatusEntity;
import com.vividsolutions.jts.geom.Point;
import org.hibernate.annotations.Type;

import java.util.Date;

public class StationSeriesEntity {
    private Long fid;
    private String eventId;
    @Type(type = "org.hibernate.spatial.GeometryType")
    private Point point;
    private Date effectivefromDate;
    private Date effectiveToDate;
    private String groupEventID;
    private Date lastModified;
    private OperationalStatusEntity operationalStatusEntityById;
    private String originEventID;
    private String remarks;
    private String processFlag;
    private DataResolutionEntity dataResolutionEntityById;
    private String eventID;
    private String branchParentEventID;
    private String fromSeriesEventID;
    private String lineLoopEventID;
    private Double beginStation;
    private Double endStation;
    private String seriesName;

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Date getEffectivefromDate() {
        return effectivefromDate;
    }

    public void setEffectivefromDate(Date effectivefromDate) {
        this.effectivefromDate = effectivefromDate;
    }

    public Date getEffectiveToDate() {
        return effectiveToDate;
    }

    public void setEffectiveToDate(Date effectiveToDate) {
        this.effectiveToDate = effectiveToDate;
    }

    public String getGroupEventID() {
        return groupEventID;
    }

    public void setGroupEventID(String groupEventID) {
        this.groupEventID = groupEventID;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getOriginEventID() {
        return originEventID;
    }

    public void setOriginEventID(String originEventID) {
        this.originEventID = originEventID;
    }

    public OperationalStatusEntity getOperationalStatusEntityById() {
        return operationalStatusEntityById;
    }

    public void setOperationalStatusEntityById(OperationalStatusEntity operationalStatusEntityById) {
        this.operationalStatusEntityById = operationalStatusEntityById;
    }

    public String getProcessFlag() {
        return processFlag;
    }

    public void setProcessFlag(String processFlag) {
        this.processFlag = processFlag;
    }

    public DataResolutionEntity getDataResolutionEntityById() {
        return dataResolutionEntityById;
    }

    public void setDataResolutionEntityById(DataResolutionEntity dataResolutionEntityById) {
        this.dataResolutionEntityById = dataResolutionEntityById;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }
}
