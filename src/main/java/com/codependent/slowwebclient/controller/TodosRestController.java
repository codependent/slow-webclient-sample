package com.codependent.slowwebclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/todos")
public class TodosRestController {

    private final WebClient webClient;

    public TodosRestController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping
    public Mono<String> getString() {
        return webClient.get().uri("https://jsonplaceholder.typicode.com/todos/1").retrieve().bodyToMono(String.class);
    }

}
