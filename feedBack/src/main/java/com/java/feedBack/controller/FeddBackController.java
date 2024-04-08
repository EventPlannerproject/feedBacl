package com.java.feedBack.controller;

import com.java.feedBack.entities.FeedBack;
import com.java.feedBack.service.IFeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("feedBack")
@CrossOrigin(origins = "*")
public class FeddBackController implements ErrorController {
    @Autowired
    IFeedBackService feedBackService;
@GetMapping("/getAll")
public List <FeedBack> getFeedBack(){
    return feedBackService.getFeedBack();}
@GetMapping("/getOne/{id}")
public Optional<FeedBack> getOne(@PathVariable("id")Long id) {

        return feedBackService.findById(id);
    }
    @PostMapping("/add")
    public FeedBack addFeedBack(@RequestBody FeedBack c){
        return feedBackService.addFeedBack(c);
    }
    @DeleteMapping("/delete/{id}")
    public void getFeedBack(@PathVariable("id") Long id) {
    	feedBackService.deleteFeedBack(id);
    }
    @PutMapping("/update")
    @ResponseBody
    public FeedBack updateFeedBack(@RequestBody FeedBack c){
        return  feedBackService.updateFeedBack(c);
    }

}