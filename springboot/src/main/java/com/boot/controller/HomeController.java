package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.services.TopicServiceImpl;

import org.springframework.web.bind.annotation.RequestMethod;



@RestController
//@Controller
public class HomeController {

	@Autowired
	private TopicServiceImpl topicService;
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String defaultHomePage()
	{
		System.out.println("TopicServiceImpl"+topicService);
		return  "hi this is spring boot application....";
	}

}
