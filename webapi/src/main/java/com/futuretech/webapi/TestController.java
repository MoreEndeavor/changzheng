package com.futuretech.webapi;

import com.futuretech.webservice.CommonMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("date")
    public String getDate() {
        Date d = CommonMethod.getCurDate();
        return "now: " + d.toString();
    }
}
