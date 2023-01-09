/**
 * 
 */
package com.secure.handler;

import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.security.sasl.AuthenticationException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;

/**
 * @author jbhogapurapu
 *
 */
public class CustomAuthenticationHandler {

	public void onAutheticationFailure(HttpServletRequest request,HttpServletResponse response, AuthenticationException exception)	throws IOException,ServletException{
		response.setStatus(HttpStatus.UNAUTHORIZED.value());
		Map<String, Object> data = new HashMap<>();
		data.put("timestamp",Calendar.getInstance().getTime());
		data.put("exception", exception.getMessage());
		response.getOutputStream().println("Unauthorized access at "+ data.get("timestamp"));
	}
	
}
