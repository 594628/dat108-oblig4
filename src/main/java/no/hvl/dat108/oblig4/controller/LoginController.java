package no.hvl.dat108.oblig4.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @Value("${url.listURL}") private String listeURL;
    @Value("${url.loginURL}") private String loginURL;
    @Value("${url.registerURL}") private String registerURL;
    @Value("${url.logoutURL}") private String logoutURL;

    @GetMapping(value = "${url.loginURL}")
    public String login(Model model){
        return loginURL;
    }

    @GetMapping(value = "${url.registerURL}")
    public String paamelding(Model model) {return registerURL;}

    @GetMapping(value = "${url.logoutURL")
    public String loggeut(Model model) {return logoutURL;}


}
