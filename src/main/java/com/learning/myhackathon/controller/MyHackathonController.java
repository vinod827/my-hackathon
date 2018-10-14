package com.learning.myhackathon.controller;

import com.learning.myhackathon.service.Hackathon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.awt.*;

@RestController
public class MyHackathonController {
    final static Log logger = LogFactory.getLog(MyHackathonController.class);

    private final Hackathon hackathon;

    @Autowired
    public MyHackathonController(Hackathon hackathon) {
        this.hackathon = hackathon;

    }

    @GetMapping(value = "/text/{encryptedText}")
    Mono<String> getUnencryptedText(@PathVariable("encryptedText") String encryptedText){
        logger.info("Entering getUnencryptedText@MyHackathonController");
        return hackathon.getUnencryptedText(encryptedText);

    }

}
