package net.tedata.openshift.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("OpenShift")
public class JavaController {

    Logger log = LoggerFactory.getLogger(JavaController.class);

	
    @Bean
	public void testBean2() {
		System.out.println("MOhsennnnnnnnnnnnnnnnnnnn");
		log.info("************************************************");
		log.info("From Bean (2) MOhsennnnnnnnnnnnnnnnnnnn");
		log.info("************************************************");

	}
    
	@GetMapping("/Print")
	public String getMessage() {
		return "Inner Message From Other Controller  -_-";
	}
	
	@PostMapping
	public void test() {
		System.out.println("MOhsennnnnnnnnnnnnnnnnnnn");
		log.info("************************************************");
		log.info("MOhsennnnnnnnnnnnnnnnnnnn");
		log.info("************************************************");
		
	}
	
}
