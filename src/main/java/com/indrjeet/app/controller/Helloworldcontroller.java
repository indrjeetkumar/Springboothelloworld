package com.indrjeet.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworldcontroller {
	 @RequestMapping("/hello")
	    String hello() {
	        return "Hi! ping me any help :-)";
	    }

}
