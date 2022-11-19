package no.hvl.dat108.oblig4.controller;

import no.hvl.dat108.oblig4.model.Deltager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class PaameldingController {
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

    @GetMapping(value = "${url.registerURL}")
    public String paamelding(Model model) {return registerURL;}

    @GetMapping("/paameldingsskjema")
    public String paameldingsskjema(Model model) {
        model.addAttribute("deltager", new Deltager());
        return "paamelding";
    }

    @PostMapping("/deltagerliste")
    public String lagreDeltager(
            @Valid @ModelAttribute("deltager") Model model,
            BindingResult bindingResult, RedirectAttributes ra) {
        if(bindingResult.hasErrors()) {
            return "paamelding";
        }
        Deltager d = new Deltager();
        ra.addFlashAttribute("success", registrationOkMsg);


        return "redirect:" + loginURL;
    }


    @PostMapping(value = "Meld meg paa")
    public String meldPaa(Model model, HttpSession session){


        return "paamelding";
    }
}

