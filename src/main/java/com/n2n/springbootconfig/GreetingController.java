package com.n2n.springbootconfig;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetingController {

	// If Key is not available in application.properties file then default value
	// will be print.
	//@Value("${app.description: default Value}")
	
	// Value is read from application.properties
	@Value("${my.greeting: default value}")
	private String greetingMessage;

	// Static Value is assign directly  
	@Value("some static message")
	private String staticMessage;

	// Gating List of Value from Application.Properties File
	@Value("${my.list.values}")
	private List<String> listValues;
	
	//You can Gate Object of map from application.properties file
//	@Value("#{${db.connection}}")
//	private Map<String, String> dbValues;
	
	// That value injected from DbSetting Class
	@Autowired
	private DbSettings dbSettings;
	
	// This Variable gating Environment Details from Environment details
	@Autowired
	private Environment env;
	
	@GetMapping("/greeting")
	public String greeting() {
//		return greetingMessage +" "+ staticMessage +" "+ listValues + " " + dbValues;
//		return dbSettings.getConnection() + " " + dbSettings.getHost() + " " + dbSettings.getPort();
		return "my.greeting: " + greetingMessage + " db.connection: " + dbSettings.getConnection();
	}
	
	@GetMapping("/envdetails")
	public String envDetails() {
		return env.toString();
	}
}
