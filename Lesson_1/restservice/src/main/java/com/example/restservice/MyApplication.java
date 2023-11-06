//package com.example.restservice;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
////@RestController
////web @Controller, поэтому Spring учитывает его при
//// обработке входящих веб-запросов.
//@SpringBootApplication
////@SpringBootApplication. Эта аннотация известна как мета-аннотация ,
//// она сочетает в себе @SpringBootConfiguration, @EnableAutoConfigurationи
//// @ComponentScan.Из них нас больше всего интересует аннотация
//// @EnableAutoConfiguration. @EnableAutoConfigurationговорит Spring Boot «угадать»,
//// как вы хотите настроить Spring, на основе добавленных вами jar-зависимостей.
//// Поскольку spring-boot-starter-webдобавлены Tomcat и Spring MVC, автоматическая настройка
//// предполагает, что вы разрабатываете веб-приложение, и соответствующим образом настраивает
//// Spring.
//public class MyApplication {
//
//    @RequestMapping("/")
//   // @RequestMapping предоставляет информацию о
//   //«маршрутизации». Он сообщает Spring, что любой HTTP-запрос с /путем должен быть сопоставлен этому homeметоду.
//   // Аннотация @RestControllerсообщает
//   // Spring, что результирующую строку следует отобразить непосредственно вызывающему объекту.
//
//    String home() {
//        return "Hello World!";
//    }
//
//    public static void main(String[] args) {
//       //  main -  метод, соответствующий соглашению Java для точки входа приложения.
//       //  Наш основной метод делегирует SpringApplicationкласс Spring Boot, вызывая run.
//        SpringApplication.run(MyApplication.class, args);
//    }
//
//}
//
//
//
//«Основной» метод
//        Последняя часть нашего приложения — это main метод. Это стандартный метод, соответствующий соглашению Java для
//        точки входа приложения. Наш основной метод делегирует SpringApplicationкласс Spring Boot, вызывая run. SpringApplicationзагружает наше приложение,
//        запуская Spring, который, в свою очередь, запускает автоматически настроенный веб-сервер Tomcat. Нам нужно передать MyApplication.classв
//        качестве аргумента метод run, чтобы определить, SpringApplicationкакой компонент Spring является основным. Массив argsтакже передается для
//        предоставления любых аргументов командной строки.
//
