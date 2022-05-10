package com.primeiroprojeto.dio.springbootweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class Controller {

    @GetMapping("/")
    public String mensagem(){
        return "Meu Primeiro Projeto Spring Boot Web";
    }
}

