package provider.Hello.service;

import api.hello.HelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/***
 *@Author icepan
 *@Date 2020/8/15 上午10:29
 *@Description
 *
 ***/

@DubboService(version = "${demo.service.version}")
public class HelloServiceImpl implements HelloService {

    @Value("${spring.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("【%s】:Hello,%s",serviceName,name);
    }
}
