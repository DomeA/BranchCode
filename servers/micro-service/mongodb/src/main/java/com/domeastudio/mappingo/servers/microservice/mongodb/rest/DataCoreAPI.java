package com.domeastudio.mappingo.servers.microservice.mongodb.rest;

import com.domeastudio.mappingo.servers.microservice.mongodb.dto.Message2Client;
import com.domeastudio.mappingo.servers.microservice.mongodb.utils.ErrorCode;
import com.domeastudio.mappingo.servers.microservice.mongodb.utils.OSInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(value = "/mongodb")
public class DataCoreAPI {

    @Autowired
    Message2Client message2Client;

    private Message2Client run(String cmd) throws InterruptedException {
        Runtime runtime = Runtime.getRuntime();
        Process process = null;
        try {
            process = runtime.exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
            message2Client.setCode(ErrorCode.unknown.getKey());
            message2Client.setMessage(ErrorCode.unknown.getValue());
            return message2Client;
        }
        process.waitFor();
        int i = process.exitValue();
        if (i == 0) {
            System.out.println("执行完成.");
            message2Client.setCode(ErrorCode.dataBaseStartSuccess.getKey());
            message2Client.setMessage(ErrorCode.dataBaseStartSuccess.getValue());
        } else {
            System.out.println("执行失败.");
            message2Client.setCode(ErrorCode.dataBaseStartFaile.getKey());
            message2Client.setMessage(ErrorCode.dataBaseStartFaile.getValue());
        }
        return message2Client;
    }

    @RequestMapping(value = "/start",
            method = RequestMethod.GET)
    public Message2Client startMongosServer() throws InterruptedException {
        if (OSInfo.isWindows()) {
            return run("");
        } else if (OSInfo.isLinux()) {
            String path = OSInfo.getClassPath("mongodbStart.sh");
            return run("/bin/sh " + path);
        } else if (OSInfo.isUnix()) {
            return run("");
        } else {
            message2Client.setCode(ErrorCode.unknown.getKey());
            message2Client.setMessage(ErrorCode.unknown.getValue());
            return message2Client;
        }
    }

    @RequestMapping(value = "/restart",
            method = RequestMethod.GET)
    public String restartMongosServer() {
        return null;
    }

    @RequestMapping(value = "/stop",
            method = RequestMethod.GET)
    public Message2Client stopMongosServer() {
        return null;
    }

    @RequestMapping(value = "/add/{json}",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Message2Client addData(@PathVariable("json") String json) {
        return null;
    }

    @RequestMapping(value = "/get/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.TEXT_PLAIN_VALUE)
    public @ResponseBody
    Message2Client getData(@PathVariable("id") String id) {
        return null;
    }

    @RequestMapping(value = "/get/",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String getAllData() {
        return null;
    }

    @RequestMapping(value = "/update/{json}",
            method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Message2Client updateData(@PathVariable("json") String json) {
        return null;
    }

    @RequestMapping(value = "/delete/{id}",
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.TEXT_PLAIN_VALUE)
    public Message2Client deleteData(@PathVariable("id") String id) {
        return null;
    }
}
