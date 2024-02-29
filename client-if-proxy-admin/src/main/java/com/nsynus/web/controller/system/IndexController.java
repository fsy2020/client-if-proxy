package com.nsynus.web.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(value = {"/", "/index", "/login"})
    public String index() {
        return "index.html";
    }
}