package no.hvl.dat108.oblig4.controller;

import no.hvl.dat108.oblig4.utils.LoginUtil;
import no.hvl.dat108.oblig4.utils.PassordUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class LoginController {
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

    @GetMapping(value = "${url.loginURL}")
    public String login(Model model){
        return loginURL;
    }

    @GetMapping(value = "${url.registerURL}")
    public String paamelding(Model model) {return registerURL;}

    @PostMapping(value = "login")
    public String tryLogin(@Valid Model model, @RequestParam(name = "password") String password,
                           HttpServletRequest request, RedirectAttributes ra) {
        if (!PassordUtil.validerMedSalt(password, "2", "2")){
            ra.addFlashAttribute("invalidPassword", invalidPasswordMsg);
            return "/";
        }
        LoginUtil.loginUser(request);
       return "redirect:" + loginURL;
    }
}
