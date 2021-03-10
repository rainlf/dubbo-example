package com.rainlf.dubbo.example.dubboconsumer.controller;

import com.rainlf.dubbo.example.dubboapi.TestApi;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : rain
 * @date : 2021/3/10 20:48
 */
@Slf4j
@RestController
public class TestController {

    @DubboReference(interfaceName = "test.api")
    private TestApi testApi;

    @GetMapping("/test")
    public String test() {
        return testApi.sayHi();
    }
}
