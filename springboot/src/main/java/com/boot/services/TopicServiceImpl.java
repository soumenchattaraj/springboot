package com.boot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.boot.formbeans.Topic;


@Service
public class TopicServiceImpl implements TopicService 
{
	private static List<Topic> topics = new ArrayList<Topic>();
	
	public void addInitialTopic()
	{
		Topic tp1 = new Topic(100,"A","topic A");
		Topic tp2 = new Topic(101,"B","topic B");
		Topic tp3 = new Topic(102,"C","topic C");

		topics.add(tp1);
		topics.add(tp2);
		topics.add(tp3);
	}
	
	public List<Topic> getAllList()
	{
		return topics;
	}
	
	public Topic getTopicById(String name)
	{
		//## using lambda function.
		return topics.stream().filter(a->a.getName().equalsIgnoreCase(name)).findFirst().get();
	}
	
	public void addTopic(Topic t)
	{
		topics.add(t);
	}
	
	
	
			

}
