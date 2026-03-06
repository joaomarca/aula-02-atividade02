package com.sistemaestudantes.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SistemaController {

    @GetMapping("/api/sistema/info")
    public Map<String, Object> info() {

        Map<String, Object> info = new HashMap<>();

        info.put("nome", "Sistema de Cadastro de Estudantes");
        info.put("versao", "1.0");
        info.put("dataHora", LocalDateTime.now());
        info.put("status", "operacional");

        return info;
    }
}