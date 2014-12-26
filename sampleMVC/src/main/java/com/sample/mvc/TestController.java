package com.sample.mvc;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;

/**
 * Handles requests for the application home page.
 */
@Controller
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(value = "/handlebars", method = {RequestMethod.GET, RequestMethod.POST})
	public String handlebars(Locale locale, Model model) {
		
		logger.info("handlebars!!!");
		
		Handlebars handlebars = new Handlebars();
		try {
			Template template = handlebars.compileInline("Hello {{this}}!");
			System.out.println(template.apply("Handlebars.java"));
			model.addAttribute("handlebars", template.apply("Handlebars.java"));
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		System.out.println("test");
		return "handlebars";
	}
	
}
