package net.projectsync.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/diagnostics")
public class DiagnosticController {

	@GetMapping("/ping")
	public String hello() {

		return "pong";
	}
}
