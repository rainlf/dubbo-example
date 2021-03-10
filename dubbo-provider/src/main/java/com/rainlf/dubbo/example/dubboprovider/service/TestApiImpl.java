package com.rainlf.dubbo.example.dubboprovider.service;

import com.rainlf.dubbo.example.dubboapi.TestApi;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;

/**
 * @author : rain
 * @date : 2021/3/10 20:45
 */
@Slf4j
@DubboService(interfaceName = "test.api")
public class TestApiImpl implements TestApi {
    @Override
    public String sayHi() {
        RpcContext rpcContext = RpcContext.getContext();
        String result = String.format("Service [name :test.api , port : %d] %s() : Hello World",
                rpcContext.getLocalPort(),
                rpcContext.getMethodName());
        log.info(result);
        return result;
    }
}
