package com.sistemaestudantes.demo.controller;

import com.sistemaestudantes.demo.model.Estudante;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EstudanteController {

    private List<Estudante> estudantes = List.of(
            new Estudante("20260001", "João", "Engenharia de Software", 3),
            new Estudante("20260002", "Maria", "Ciência da Computação", 2),
            new Estudante("20260003", "Carlos", "Sistemas de Informação", 4),
            new Estudante("20260004", "Ana", "Engenharia de Software", 1)
    );

    @GetMapping("/api/estudantes/{matricula}")
    public Estudante buscarEstudante(@PathVariable String matricula) {

        for (Estudante estudante : estudantes) {
            if (estudante.getMatricula().equals(matricula)) {
                return estudante;
            }
        }

        return null;
    }

    @GetMapping("/api/estudantes")
    public List<Estudante> buscarPorCurso(@RequestParam String curso) {

        List<Estudante> resultado = new ArrayList<>();

        for (Estudante estudante : estudantes) {
            if (estudante.getCurso().equalsIgnoreCase(curso)) {
                resultado.add(estudante);
            }
        }

        return resultado;
    }
}