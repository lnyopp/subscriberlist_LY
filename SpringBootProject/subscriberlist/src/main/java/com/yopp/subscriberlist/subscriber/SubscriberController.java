package com.yopp.subscriberlist.subscriber;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubscriberController {
    @GetMapping
    public String index(Subscriber subscriber){
        return "subscriber/index";
    }
    
}