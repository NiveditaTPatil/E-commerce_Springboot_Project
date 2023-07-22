package com.ECommerce.ECommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ECommerce.ECommerce.Model.User;
import com.ECommerce.ECommerce.Service.Eservice;

@Controller
public class EController {
    @Autowired
    Eservice service;

    @GetMapping("/")
    public String display() {
        return "index";
    }

    @GetMapping("/log")
    public String show() {
        return "login";
    }

    @GetMapping("/sign")
    public String welcome() {
        return "signin";
    }

    @GetMapping("/signup")
    public String signupPage() {
        return "redirect:/sign";
    }

    @GetMapping("/hello")
    public String wel() {
        return "home";
    }

    @GetMapping("/aboutus")
    public String aboutpage() {
        return "about";
    }

    @GetMapping("/contactus")
    public String contactpage() {
        return "contact";
    }

    @GetMapping("/womens")
    public String womenpage() {
        return "Women";
    }

    @GetMapping("/mens")
    public String menpage() {
        return "Men";
    }

    @GetMapping("/kids")
    public String kidpage() {
        return "kid";
    }

    @GetMapping("/traditional")
    public String show1() {
        return "Traditionalw";
    }
@GetMapping("/Formalw")
    public String show2() {
        return "formalw";
    }
@GetMapping("/accessoriesw")
    public String show3() {
        return "Accessories";
    }
    @GetMapping("/menformal")
    public String menformalpage() {
        return "Menformal";
    }
@GetMapping("/mentraditional")
    public String mentraditionpage() {
        return "Mentraditional";
    }
@GetMapping("/menaccessories")
    public String menAccesoriespage() {
        return "Maccessories";
    }

    @GetMapping("/kidformal")
    public String kidformalpage() {
        return "Kidformal";
    }
    @GetMapping("/kidtradition")
    public String kidtraditionlpage() {
        return "Kidtraditional";
    }
    @GetMapping("/kidaccessories")
    public String kidAccesoriespage() {
        return "Kidaccessories";
    }
    @PostMapping("/log")
    public String add(@ModelAttribute User use, Model model) {
        System.out.println(use.toString());
        model.addAttribute("email", use.getEmail());
        model.addAttribute("password", use.getPassword());
        service.add(use);
        return "login";
    }
}
