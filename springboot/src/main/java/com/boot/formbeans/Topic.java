package com.boot.formbeans;

public class Topic {
	
	private int id;
	private String name;
	private String topic;
	
	
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Topic(int id, String name, String topic) {
		super();
		this.id = id;
		this.name = name;
		this.topic = topic;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	
	
	
	

}
