package me.gabriel.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //rota da página inicial
    @GetMapping({"","/"})
    public String getHomePage() {
        return "index";
    }

    //rota da página de contato
    @GetMapping("/contact")
    public String getContactPage() {
        return "contact";
    }

    //rota da página de privacidade
    @GetMapping("/privacy")
    public String getPrivacyPage() {
        return "privacy";
    }

}
