package io.dongsuk.dbatch.common.controller;

import io.dongsuk.dbatch.common.batch.TestCronTrigger;
import io.dongsuk.dbatch.common.data.entity.Bilionair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/API")
public class APIController {
    @Autowired
    TestCronTrigger testCronTrigger;

    @RequestMapping("test-jpa")
    public ResponseEntity<Bilionair> testJpa(){
        return null;
    }

    @RequestMapping("/addJobTest")
    public String jobTest(){
        try {
            testCronTrigger.createScheduler();

        }catch(Exception e){
            e.printStackTrace();
            return "Exception";
        }
        return "success";
    }
}
