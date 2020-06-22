package com.yopp.subscriberlist.subscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;





@Controller
public class SubscriberController {

    @Autowired
    private SubscriberRepository subscriberRespository;

    @GetMapping
    public String index(Subscriber subscriber){
        return "subscriber/index";
    }

    private Subscriber subscriber;

    public String addNewSubscriber(Subscriber subscriber, Model model){
        subscriberRespository.save(new Subscriber(subscriber.getFirstName(),subscriber.getLastName(),subscriber.getUserName(),subscriber.getSignedUp()));
        model.addAttribute("firstName", subscriber.getFirstName());
        model.addAttribute("lastName", subscriber.getLastName());
        model.addAttribute("userName", subscriber.getUserName());

        return "subscriber/result";

        
    }

    
}