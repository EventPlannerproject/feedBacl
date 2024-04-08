package com.java.feedBack.repository;

import com.java.feedBack.entities.FeedBack;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFeedBackRepository extends CrudRepository<FeedBack,Long> {


}
