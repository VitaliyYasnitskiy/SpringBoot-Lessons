package com.example.restservice;

public record Greeting(long id, String content) {

    //бъект Greetingнеобходимо преобразовать в JSON. Благодаря поддержке конвертера HTTP-сообщений Spring вам не нужно
}