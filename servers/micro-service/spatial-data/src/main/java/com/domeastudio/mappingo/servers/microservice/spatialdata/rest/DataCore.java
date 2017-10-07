package com.domeastudio.mappingo.servers.microservice.spatialdata.rest;

import com.domeastudio.mappingo.servers.microservice.spatialdata.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/spatialdata")
public class DataCore {
    @Autowired
    DataService dataService;

    @RequestMapping(value = "/add/point/{x}/{y}", method = RequestMethod.GET)
    public void addPoint(@PathVariable("x") String x,
                         @PathVariable("y") String y) {
        Date date = new Date();
        for (int i = 0; i < 10000; i++) {
            dataService.addEquipment(x, y);
        }
        Date date1 = new Date();
        Long d = (date1.getTime() - date.getTime()) / 60000;
        System.out.println(d);
    }

//    @RequestMapping(value="/add/line/{wkt}",method = RequestMethod.GET)
//    public void addLine(@PathVariable("x") String x,
//                        @PathVariable("y") String y){
//    }
}
