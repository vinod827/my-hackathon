package com.learning.myhackathon.service;

import reactor.core.publisher.Mono;

public interface Hackathon {

    public Mono<String> getUnencryptedText(String encryptedText);

}
