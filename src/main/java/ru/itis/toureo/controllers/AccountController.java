package ru.itis.toureo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.toureo.services.SignUpService;
import ru.itis.toureo.services.TourService;


@Controller
public class AccountController {

    @Autowired
    private TourService tourService;

    @Autowired
    private SignUpService signUpService;

 /*   @GetMapping("/account")
    public String getProfile(@AuthenticationPrincipal UserDetailsImpl userDetails, Model model) {
        model.addAttribute("tours", tourService.getALlToursByUserId(userDetails.getUser().getId()));
        model.addAttribute("user", signUpService.getUserById(userDetails.getUser().getId()));
        return "account";
    }

  */
}
