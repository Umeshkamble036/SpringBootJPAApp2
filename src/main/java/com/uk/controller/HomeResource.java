package com.uk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	@RequestMapping("/")
	public String homePage() {
		return ("<h1>Home</h1>");
	}

	@RequestMapping("/admin")
	public String adminPage() {
		return ("<h1>Home Admin</h1>");
	}

	@RequestMapping("/user")
	public String userPage() {
		return ("<h1>Home User</h1>");
	}

}
