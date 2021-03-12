package com.lwm.springcloud.controller;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lwm.springcloud.entities.User;

@Controller
public class ConsumerController {
	private static final String REST_URL_PREFIX = "http://login";
	@Autowired
	private RestTemplate restTemplate;

//	@RequestMapping("/select")
//	public User select(String name){
//		 return restTemplate.getForObject(REST_URL_PREFIX+"/index",User.class);
//		
//	}
	
	@RequestMapping("/test")
	public String test(HttpServletRequest request){
		return "test";
		
	}
	
	@RequestMapping("/game-review")
	public String game_review(HttpServletRequest request){
		return "game-review";
		
	}
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request){
		return "index";
	}
	
	
	
	@RequestMapping("/consumer/mydata")
	public String mydata(){
		 return "mydata";
	}
	
	@RequestMapping("/consumer/register")
	public String register(){
		 return "register";
	}
	
}
