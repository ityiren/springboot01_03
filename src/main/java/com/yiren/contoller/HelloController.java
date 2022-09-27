package com.yiren.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 易人
 * @version V1.0
 * @Package IntelliJ IDEA
 * @date 2022/9/27 21:15
 * @Description:
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello linux";
    }
}
