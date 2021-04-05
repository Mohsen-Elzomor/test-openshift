package net.tedata.openshift.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class OpenShiftController {

	Logger log = LoggerFactory.getLogger(OpenShiftController.class);

	@PostMapping
	public void test() {
		System.out.println("MOhsennnnnnnnnnnnnnnnnnnn");
		log.info("************************************************");
		log.info("MOhsennnnnnnnnnnnnnnnnnnn");
		log.info("************************************************");

	}
	
	@Bean
	public void testBean() {
		System.out.println("MOhsennnnnnnnnnnnnnnnnnnn");
		log.info("************************************************");
		log.info("From bean (1) MOhsennnnnnnnnnnnnnnnnnnn");
		log.info("************************************************");

	}

	@GetMapping("/GetMessages")
	public String getMessage() {
		return "Inner Message From Open Shift  -_-";
	}

	@GetMapping("/")
	public String getMessage2() {
		return "Root Message From Open Shift  -_-";
	}
}
