package com.hsnam.sample.restapi.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @Slf4j
@RequestMapping("/api/v1/get")
public class GetController {

    @GetMapping("/houses/apartments")
    public ResponseEntity getApiRelationship(){
        return new ResponseEntity(HttpStatus.OK);
    }

}
