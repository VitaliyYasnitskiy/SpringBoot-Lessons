package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //. Это сокращение для включения обоих @Controllerи @ResponseBody.
//гарантирует, что HTTP-запросы GET /greetingсопоставляются с greeting() методом.
//которая помечает класс как контроллер, где каждый метод возвращает объект домена вместо представления.
//Это сокращение для включения обоих @Controllerи @ResponseBody.

public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        //@RequestParam привязывает значение параметра строки запроса nameк name параметру метода greeting().
        // Если name параметр в запросе отсутствует, используется defaultValueof .World

        return new Greeting(counter.incrementAndGet(), String.format(template, name)); //Реализация тела метода создает и
        // возвращает новый Greetingобъект с атрибутами idи contentна основе следующего значения из counter и форматирует
        // данные name с помощью приветствия template.
    }
}