package com.example.springsecuritywithuserdetailservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class HelloController {

    @RestController
    public class SpringSecurityJpaController {
        @RequestMapping(path = "/", method = RequestMethod.GET)
        public String home(){

            return ("<h1>Welcome</h1>");
        }
        @RequestMapping(path = "/user", method = RequestMethod.GET)
        public String user(){

            return ("<h1>Welcome User</h1>");
        }

        @RequestMapping(path = "/admin", method = RequestMethod.GET)
        public String admin(){

            return ("<h1>Welcome Admin</h1>");
        }
    }
}
