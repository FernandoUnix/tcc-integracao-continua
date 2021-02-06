package com.exemplo.integracao.continua.resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExemploController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("versao", "Versão 1");
        return "index";
    }
}
