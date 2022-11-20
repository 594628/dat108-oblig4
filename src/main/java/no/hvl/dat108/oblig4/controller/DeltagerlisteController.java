package no.hvl.dat108.oblig4.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeltagerlisteController {
    // URL verdier
    @Value("${url.listURL}") private String listeURL;
    @Value("${url.loginURL}") private String loginURL;
    @Value("${url.registerURL}") private String registerURL;
    @Value("${url.logoutURL}") private String logoutURL;

    // Melding verdier
    @Value("${message.noPasswordMatch}") private String noPassMatchMsg;
    @Value("${message.invalidPassword}") private String invalidPasswordMsg;
    @Value("${message.requireLogin}") private String requireLoginMsg;
    @Value("${message.logout}") private String logoutMsg;
    @Value("${message.registeredOk}") private String registrationOkMsg;

    @GetMapping(value = "${url.logoutURL}")
    public String loggout(Model model) {return loginURL;}

    @GetMapping(value = "${url.listURL}")
    public String guests(Model model) {return listeURL;}

}
