package com.logos.demo.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.logos.demo.model.Person;
import com.logos.demo.service.PersonService;

@Controller
@RequestMapping("/users")
public class UserController {

	@Inject
	private PersonService personService;

	@RequestMapping(method = RequestMethod.GET)
	public String getAll(Model model, HttpServletRequest request) {

		model.addAttribute("context", request.getContextPath());
		model.addAttribute("personList", personService.getAll());
		
		return "users";
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@RequestParam String name) {
		personService.save(new Person(name));
		return "redirect:/users";
	}
	

}
