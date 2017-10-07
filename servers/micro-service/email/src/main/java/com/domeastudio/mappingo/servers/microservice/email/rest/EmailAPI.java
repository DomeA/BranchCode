package com.domeastudio.mappingo.servers.microservice.email.rest;

import com.domeastudio.mappingo.servers.microservice.email.config.MailConfig;
import com.domeastudio.mappingo.servers.microservice.email.dto.Message2Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/email")
public class EmailAPI {
    @Autowired
    private MailConfig mailConfig;

    @RequestMapping(value = "/run", method = RequestMethod.GET)
    public Message2Client run() {
        System.out.println(mailConfig.getUserName());
        System.out.println(mailConfig.getPwd());
        System.out.println(mailConfig.getProtocol());
        System.out.println(mailConfig.getMessage());
        return null;
    }

    @RequestMapping(value = "/stop", method = RequestMethod.GET)
    public Message2Client stop() {
        return null;
    }

    @RequestMapping(value = "/restart", method = RequestMethod.GET)
    public Message2Client reStart() {
        return null;
    }

    @RequestMapping(value = "/send/mail/{userName}/{time}/{token}", method = RequestMethod.POST)
    public Message2Client sendMail() {
        return null;
    }

    @RequestMapping(value = "/receive/mail/{userName}/{time}/{token}", method = RequestMethod.POST)
    public Message2Client receiveMail() {
        return null;
    }
}
