package consumer.Hello.controller;

import api.hello.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *@Author icepan
 *@Date 2020/8/15 上午11:09
 *@Description
 *
 ***/

@RestController
public class HelloController {

    @DubboReference(version = "${demo.service.version}")
    private HelloService helloService;


    @GetMapping("/hello")
    public String Hello(){
        return helloService.sayHello("icepan");
    }



}
