package br.com.aula.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aluno")

public class AlunoController {

    @GetMapping
    public String consulta() {
        return "Aprendendo API Rest";
    }

}
