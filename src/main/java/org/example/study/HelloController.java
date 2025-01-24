package org.example.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello") //get요청을 처리할 메소드
    @ResponseBody // 응답시 문자열이 나오게 하는 어노테이션
    public String showHello(){
        return "Hello World";
    }
}
