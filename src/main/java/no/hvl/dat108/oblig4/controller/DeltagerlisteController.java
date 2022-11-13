package no.hvl.dat108.oblig4.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeltagerlisteController {
    @Value("${url.listURL}") private String listeURL;
    @Value("${url.loginURL}") private String loginURL;
    @Value("${url.registerURL}") private String registerURL;
    @Value("${url.logoutURL}") private String logoutURL;

    @GetMapping
    public String standard(Model model){
        return loginURL;
    }

    @GetMapping(value = "${url.logoutURL")
    public String loggeut(Model model) {return loginURL;}

    @GetMapping(value = "${url.listeURL")
    public String gjestelise(Model model) {return listeURL;};

}
