package es.anma.articles.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FamilyController {


    @RequestMapping(value = "/test" , method = RequestMethod.GET)
    public String getTest(){
        return new String("This is your name: ");
    }
}
