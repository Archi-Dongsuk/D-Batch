package io.dongsuk.dbatch.common.controller;

import io.dongsuk.dbatch.common.data.entity.Bilionair;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/API")
public class APIController {
    @RequestMapping("test-jpa")
    public ResponseEntity<Bilionair> testJpa(){
        return null;
    }
}
