package com.learning.myhackathon.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service("hackathon")
public class HackathonService implements Hackathon {
    final static Log logger = LogFactory.getLog(HackathonService.class);

    @Override
    public Mono<String> getUnencryptedText(String encryptedText) {
        logger.info("Entering getUnencryptedText@HackathonService");

        StringBuffer word = new StringBuffer();
        for(int i=0; i<encryptedText.length(); i++){
            word.append(String.valueOf((char) (encryptedText.charAt(i) - 2)));

        }
        logger.info("word: "+word.toString());
        logger.info("Exiting getUnencryptedText@HackathonService");

        return Mono.just(word.toString());
    }
}
