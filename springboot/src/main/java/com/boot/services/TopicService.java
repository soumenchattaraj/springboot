package com.boot.services;

import java.util.List;

import com.boot.formbeans.Topic;

public interface TopicService {
	
	public List<Topic> getAllList();
	public Topic getTopicById(String name);
	public void addTopic(Topic topic);
	public void addInitialTopic();
											

}
