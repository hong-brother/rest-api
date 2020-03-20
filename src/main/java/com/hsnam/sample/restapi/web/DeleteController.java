package com.hsnam.sample.restapi.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1/delete")
public class DeleteController {

    @DeleteMapping("/item/{pk}")
    public ResponseEntity deleteItem(@PathVariable String pk){
        log.info("PK={}",pk);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
