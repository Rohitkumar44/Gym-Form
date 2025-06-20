package com.example.gym;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @Autowired
    private MemberRepository repository;

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("member", new Member());
        return "form";
    }

    @PostMapping("/register")
    public String submitForm(Member member, Model model) {
        repository.save(member);
        model.addAttribute("message", "Registration successful!");
        return "form";
    }
}