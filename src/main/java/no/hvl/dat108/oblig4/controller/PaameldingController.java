package no.hvl.dat108.oblig4.controller;

import no.hvl.dat108.oblig4.model.Deltager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class PaameldingController {
    @Value("${url.listURL}") private String listeURL;
    @Value("${url.loginURL}") private String loginURL;
    @Value("${url.registerURL}") private String registerURL;
    @Value("${url.logoutURL}") private String logoutURL;

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
            BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "paamelding";
        }
        return "paamelding";
    }

    @GetMapping
    public String standard(Model model){
        return registerURL;
    }


    @PostMapping(value = "Meld meg paa")
    public String meldPaa(Model model, HttpSession session){


        return "paamelding";
    }
}
