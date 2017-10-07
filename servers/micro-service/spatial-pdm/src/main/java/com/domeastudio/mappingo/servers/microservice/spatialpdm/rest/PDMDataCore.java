package com.domeastudio.mappingo.servers.microservice.spatialpdm.rest;

import com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo.system.ActivityTypeEntity;
import com.domeastudio.mappingo.servers.microservice.spatialpdm.repository.ActivityTypeRepository;
import com.domeastudio.mappingo.servers.microservice.spatialpdm.service.DataDictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping(value = "/pdminit")
public class PDMDataCore {
    @Autowired
    DataDictionary dataDictionary;
    @Autowired
    ActivityTypeRepository activityTypeRepository;

    @RequestMapping(value = "/databaseinit", method = RequestMethod.GET)
    public void dataBaseInit() {
        dataDictionary.dictionaryInitialization();
    }

    @RequestMapping(value = "/activityType/{value}", method = RequestMethod.GET)
    public @ResponseBody
    List<ActivityTypeEntity> getActivityType(@PathVariable("value") String value) {
        List<ActivityTypeEntity> activityTypeEntityList = new ArrayList<ActivityTypeEntity>();
        Iterator<ActivityTypeEntity> iterator = activityTypeRepository.findAll().iterator();
        while (iterator.hasNext()) {
            activityTypeEntityList.add(iterator.next());
        }
        if ("all".equals(value.toLowerCase())) {
            return activityTypeEntityList;
        } else {
            List<ActivityTypeEntity> activityTypeEntityList1 = new ArrayList<ActivityTypeEntity>();
            for (int i = 0; i < activityTypeEntityList.size(); i++) {
                if (activityTypeEntityList.get(i).getValue().equals(Integer.parseInt(value))) {
                    activityTypeEntityList1.add(activityTypeEntityList.get(i));
                }
            }
            return activityTypeEntityList1;
        }
    }

    @RequestMapping(value = "/activityType/{value}/{name}", method = RequestMethod.GET)
    public void addActivityType(@PathVariable("value") Integer value, @PathVariable("name") String name) {
        ActivityTypeEntity activityTypeEntity = new ActivityTypeEntity();
        activityTypeEntity.setName(name);
        activityTypeEntity.setValue(value);
        activityTypeRepository.save(activityTypeEntity);
    }
}
