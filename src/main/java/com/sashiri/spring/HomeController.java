package com.sashiri.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


//Serve para informar ao sistema que existem vários caminhos para acessar.
@Controller
public class HomeController {

    //Indica um endpoint(endereço) ao utilizador
    @RequestMapping("/")
    public String homeApp(Model model) {
        model.addAttribute("mensagem", "Mensagem injetada através do Model");
        return "index";
    }
}
