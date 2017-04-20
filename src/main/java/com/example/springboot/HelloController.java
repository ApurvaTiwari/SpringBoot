package com.example.springboot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	public static final Logger logger = LogManager.getLogger(HelloController.class);

	@Value("${name}")
	private String name;

	@RequestMapping("/")
	public String index() {

		String returnString = "HELLO".concat(name);
		logger.info("============ Return String is ===================" + returnString);
		return returnString;
	}

}
