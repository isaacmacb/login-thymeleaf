package com.projeto.layout.Controller;

import com.projeto.layout.model.taks;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class taksController {
    @GetMapping("/create")
    public String home() {
        return "create";
    }

    @PostMapping("/create")
    public void create(taks taks) {
        System.out.println("O nome da tarefa é: " + taks.getName());
    }
}
