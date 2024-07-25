package com.ingenieria.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @GetMapping("/registro")
    public String registro() {
        return "registro";
    }

}
