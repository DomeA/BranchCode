package com.domeastudio.mappingo.servers.microservice.spatialdata.service;


import com.vividsolutions.jts.geom.LineString;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;

public interface DataService {
    void addEquipment(String x, String y);

    void addEquipment(String wkt);

    void addPipePoint(String x, String y);

    void addPipePoint(String wkt);

    void addLine(String wkt);

    void addPolygon(String wkt);

    void addEquipment(Point point);

    void addPipePoint(Point point);

    void addLine(LineString lineString);

    void addPolygon(Polygon polygon);
}
