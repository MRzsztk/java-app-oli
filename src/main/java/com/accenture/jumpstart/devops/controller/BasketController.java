package com.accenture.jumpstart.devops.controller;

import java.util.concurrent.atomic.AtomicLong;
import com.accenture.jumpstart.devops.model.Basket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasketController {

	private static final String template = "Hello, %s - I will be your basket service!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/basket")
	public Basket basket(@RequestParam(value = "name", defaultValue = "World") final String name) {
		return new Basket(counter.incrementAndGet(), String.format(template, name));
    }
}
