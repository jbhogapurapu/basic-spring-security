/**
 * 
 */
package com.secure.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jbhogapurapu
 *
 */
@RestController
@RequestMapping(path = "spring/security")
public class Controller {
	@GetMapping(path = "/message")
	public String message() {
		return "<h1>Welcome "+ new Date() +"</h1>";
	}

}
