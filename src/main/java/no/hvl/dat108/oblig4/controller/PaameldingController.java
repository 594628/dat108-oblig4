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
    @Value("${url.listURL}") private String listeURL;
    @Value("${url.loginURL}") private String loginURL;
    @Value("${url.registerURL}") private String registerURL;
    @Value("${url.logoutURL}") private String logoutURL;
    @Value("${message.registeredOk}") private String SUCCESSMELDING;

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
        ra.addFlashAttribute("success", SUCCESSMELDING);


        return "redirect:" + loginURL;
    }


    @PostMapping(value = "Meld meg paa")
    public String meldPaa(Model model, HttpSession session){


        return "paamelding";
    }
}


//package no.hvl.dat108.oblig4.old.controller;
//
//import no.hvl.dat108.oblig4.old.utils.LoginUtil;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//@Controller
//public class LoginController {
//    @Value("${message.invalidPassword}") private String INVALID_PASSWORD_MESSAGE;
//    @Value("${url.loginURL}") private String LOGIN_URL;
//    @Value("${url.handleURL}") private String HANDLE_URL;
//    @Value("${Password}") private String PASSWORD;
//
////    @GetMapping
////    public String getLoginHome(Model model,
////                           HttpSession session){
////        if (LoginUtil.isUserLoggedIn(session)){
////            return "redirect:" + HANDLE_URL;
////        }
////        return LOGIN_URL;
////    }
//    @GetMapping(value = "login")
//    public String getLogin(Model model,
//                           HttpSession session){
//        if (LoginUtil.isUserLoggedIn(session)){
//            return "redirect:" + HANDLE_URL;
//        }
//        return LOGIN_URL;
//    }
//
//    @PostMapping(value = "login")
//    public String tryLogin(Model model, @RequestParam(name = "password") String password,
//                           HttpServletRequest request, RedirectAttributes ra) {
//        if (!password.equals(PASSWORD)){
//            ra.addFlashAttribute("message", INVALID_PASSWORD_MESSAGE);
//            return "redirect:" + LOGIN_URL;
//        }
//        LoginUtil.loginUser(request);
//        return "redirect:" + HANDLE_URL;
//    }
//}
