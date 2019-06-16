 
package com.hotel.web;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//You can add this if you want or remove this class level mapping
@RequestMapping("/testApp")
public class TestController {

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }
    
    @RequestMapping("/searchHotel")
    public String home1() {
        return "Hello World";
    }
}