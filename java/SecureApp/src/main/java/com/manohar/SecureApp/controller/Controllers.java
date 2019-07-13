package com.manohar.SecureApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller(value = "/api")
public class Controllers {

    @GetMapping(value = "/getUsers",produces = "application/json")
    public ResponseEntity<List<String>> getUsers() {
        List<String> list = new ArrayList<>();
        list.add("abc");
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
