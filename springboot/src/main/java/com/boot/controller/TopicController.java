package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.formbeans.Topic;
import com.boot.services.TopicService;
import com.boot.services.TopicServiceImpl;

@RestController
public class TopicController {
	
	
	@Autowired
	private TopicService topicService;
	



	@RequestMapping("/initial")
	public void listOfTpoics()
	{
		topicService.addInitialTopic();
	}
	
	@RequestMapping("/topic")
	public List<Topic> getTopicList()
	{
		return topicService.getAllList();
	}
	
	@RequestMapping("/topic/{topicId}")
	public Topic getTopicById(@PathVariable String topicId)
	{
		return topicService.getTopicById(topicId);
	}
	
	
	@RequestMapping(value="/topic",method=RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic)
	{
		topicService.addTopic(topic);
	}
	
}
