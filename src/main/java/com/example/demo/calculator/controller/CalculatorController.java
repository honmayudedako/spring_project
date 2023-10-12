package com.example.demo.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.calculator.service.CalculatorService;

@Controller
public class CalculatorController {

	private final CalculatorService calculatorService;

	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@GetMapping("calculation")
	public String showForm() {
		return "calculator.html";
	}

	@PostMapping("calculation")
	public String calculation(@RequestParam("num1") int num1,
			@RequestParam("operator") String operator,
			@RequestParam("num2") int num2,
			Model model) {

		int result = calculatorService.calculate(num1, operator, num2);

		model.addAttribute("result", result);

		return "calculator.html";
	}
}