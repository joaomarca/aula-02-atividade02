package com.sistemaestudantes.demo.controller;

import com.sistemaestudantes.demo.model.Curso;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {

    private List<Curso> cursos = List.of(
            new Curso(1, "Engenharia de Software"),
            new Curso(2, "Ciência da Computação"),
            new Curso(3, "Sistemas de Informação"),
            new Curso(4, "Análise e Desenvolvimento de Sistemas"),
            new Curso(5, "Engenharia da Computação")
    );

    @GetMapping("/api/cursos")
    public List<Curso> listarCursos() {
        return cursos;
    }

    @GetMapping("/api/cursos/{id}")
    public String buscarCurso(@PathVariable int id) {

        for (Curso curso : cursos) {
            if (curso.getId() == id) {
                return curso.getNome();
            }
        }

        return "Curso não encontrado";
    }
}