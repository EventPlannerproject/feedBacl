package com.java.feedBack.service;

import com.java.feedBack.entities.FeedBack;

import java.util.List;
import java.util.Optional;


public interface IFeedBackService {
    public Optional<FeedBack> findById(Long id);

    public void deleteFeedBack(Long id);
    public List<FeedBack> getFeedBack ();
    public FeedBack addFeedBack(FeedBack C);
    public FeedBack updateFeedBack(FeedBack C);

}

