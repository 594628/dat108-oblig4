package no.hvl.dat108.oblig4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PaameldingController {

    @PostMapping(value = "Meld meg paa")
    public String meldPaa(Model model, HttpSession session){


        return "paamelding";
    }
}
