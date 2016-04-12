package com.logos.demo.controller;

import java.lang.invoke.MethodHandles;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.logos.demo.dao.PersonDao;

@Controller
public class HomeController {

	private static final Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());

	@Inject
	private PersonDao personDao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, HttpServletRequest request) {
		logger.info("Welcome home!");
		
		model.addAttribute("context", request.getContextPath());
		model.addAttribute("personList", personDao.findAll());

		return "home";
	}

}
