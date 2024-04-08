package com.java.feedBack.service;


import com.java.feedBack.entities.FeedBack;
import com.java.feedBack.repository.IFeedBackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class FeedBackServiceImpl implements IFeedBackService {


    @Autowired
    IFeedBackRepository feedBackRepository;

    @Override
    public Optional<FeedBack> findById(Long id) {
        return feedBackRepository.findById(id);
    }
    @Override
    public List<FeedBack> getFeedBack(){
        List<FeedBack> candidates = new ArrayList<>();
        feedBackRepository.findAll().forEach(candidates::add);
        System.out.println (candidates);
        return candidates;
    }
    @Override
    public FeedBack addFeedBack(FeedBack c) {
        return feedBackRepository.save(c);
    }
    @Override
    public void deleteFeedBack(Long id) {
    	feedBackRepository.deleteById(id);
    }

    @Override
    public FeedBack updateFeedBack(FeedBack c) {
        return feedBackRepository.save(c);
    }



}
