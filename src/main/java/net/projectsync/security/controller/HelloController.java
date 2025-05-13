package net.projectsync.security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping({"/", "/hello", "/welcome"})
    public String greet(HttpServletRequest request) {
        return "Welcome to Telusko "+request.getSession().getId();
    }
}