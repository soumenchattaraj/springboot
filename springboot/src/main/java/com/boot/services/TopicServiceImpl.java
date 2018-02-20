package com.boot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.boot.dao.TopicDao;
import com.boot.formbeans.Topic;


@Service
public class TopicServiceImpl implements TopicService 
{
	
	@Autowired
	TopicDao topicDao;
	
	
	private static List<Topic> topics = new ArrayList<Topic>();
	
	/*public void topicDao()
	{
		Topic tp1 = new Topic(100,"A","topic A");
		Topic tp2 = new Topic(101,"B","topic B");
		Topic tp3 = new Topic(102,"C","topic C");

		topics.add(tp1);
		topics.add(tp2);
		topics.add(tp3);
	}*/
	
	public List<Topic> getAllList()
	{
		List<Topic> list = new ArrayList<Topic>();  
		
		topicDao.findAll().forEach(list::add);
		return list;
	}
	
	public Topic getTopicById(String name)
	{
		//## using lambda function.
		//return topics.stream().filter(a->a.getName().equalsIgnoreCase(name)).findFirst().get();
		return topicDao.findOne(name);
	}
	
	public void addTopic(Topic t)
	{
		topicDao.save(t);
	}

	@Override
	public void updateTopicById(int id, Topic topic) 
	{
		//Integer topicId = id;
		topicDao.save(topic);
	}

	@Override
	public void addInitialTopic() {
		
		Topic tp1 = new Topic(100,"A","topic A");
		Topic tp2 = new Topic(101,"B","topic B");
		Topic tp3 = new Topic(102,"C","topic C");

		topics.add(tp1);
		topics.add(tp2);
		topics.add(tp3);
	}
	public List<Topic> getAllTempList()
	{
		/*List<Topic> list = new ArrayList<Topic>();  
					list.addAll(topics);
		*/
		System.out.println("listSize:::"+topics.size());
		return topics;
	}


	
	
	
			

}
