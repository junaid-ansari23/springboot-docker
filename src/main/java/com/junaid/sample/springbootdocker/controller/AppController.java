/**
 * 
 */
package com.junaid.sample.springbootdocker.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.junaid.sample.springbootdocker.SpringbootDockerApplication;

/**
 * @author juansari
 *
 */
@RestController
public class AppController {

	private static Logger logger = LoggerFactory.getLogger(SpringbootDockerApplication.class);

	@Value("${spring.env.name}")
	private String env;

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String,String> getMessage(HttpServletRequest request) {
		Map<String,String> output=new HashMap<>();
		output.put("status", "success");
		logger.info("Spring profile running: {}",env);
		return output;
	}

}
