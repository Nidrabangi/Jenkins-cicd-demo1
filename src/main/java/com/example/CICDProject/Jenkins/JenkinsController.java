package com.example.CICDProject.Jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class JenkinsController {
	
	
	@GetMapping("/hello")
	public String getMethodName() {
		return "Welcome Again CI CD";
	}
	

}
