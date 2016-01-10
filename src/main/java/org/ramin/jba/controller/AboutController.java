package org.ramin.jba.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {

	private static final Logger logger = LoggerFactory.getLogger(AboutController.class);
	
	@RequestMapping("/about")
	public String about( Model model)
	{
		 logger.info("About page !");
		return "about";
	}
}
