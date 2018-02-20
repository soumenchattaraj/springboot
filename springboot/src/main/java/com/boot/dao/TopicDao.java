package com.boot.dao;

import org.springframework.data.repository.CrudRepository;

import com.boot.formbeans.Topic;

public interface TopicDao extends CrudRepository<Topic,String> {

}
