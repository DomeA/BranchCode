package com.domeastudio.mappingo.servers.microservice.spatialdata.service.impl;

import com.domeastudio.mappingo.servers.microservice.spatialdata.pojo.geom.EquipmentPointEntity;
import com.domeastudio.mappingo.servers.microservice.spatialdata.repository.EquipmentRepository;
import com.domeastudio.mappingo.servers.microservice.spatialdata.service.DataService;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.LineString;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    EquipmentRepository equipmentRepository;

    @Override
    public void addEquipment(String x, String y) {
        EquipmentPointEntity equipmentPointEntity = new EquipmentPointEntity();
        Point point = (Point) wktToGeometry("POINT (" + x + " " + y + ")");
        equipmentPointEntity.setLocation(point);
        equipmentRepository.save(equipmentPointEntity);
    }

    @Override
    public void addEquipment(String wkt) {
        EquipmentPointEntity equipmentPointEntity = new EquipmentPointEntity();
        Point point = (Point) wktToGeometry(wkt);
        equipmentPointEntity.setLocation(point);
        equipmentRepository.save(equipmentPointEntity);
    }

    @Override
    public void addPipePoint(String x, String y) {

    }

    @Override
    public void addPipePoint(String wkt) {

    }

    @Override
    public void addLine(String wkt) {

    }

    @Override
    public void addPolygon(String wkt) {

    }

    @Override
    public void addEquipment(Point point) {

    }

    @Override
    public void addPipePoint(Point point) {

    }

    @Override
    public void addLine(LineString lineString) {

    }

    @Override
    public void addPolygon(Polygon polygon) {

    }

    private Geometry wktToGeometry(String wktPoint) {
        WKTReader fromText = new WKTReader();
        Geometry geom = null;
        try {
            geom = fromText.read(wktPoint);
        } catch (ParseException e) {
            throw new RuntimeException("Not a WKT string:" + wktPoint);
        }
        return geom;
    }
}
