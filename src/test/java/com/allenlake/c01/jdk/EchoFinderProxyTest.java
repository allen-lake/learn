package com.allenlake.c01.jdk;

import com.allenlake.c01.stub.PureService;
import com.allenlake.c01.stub.PureServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 请填写类注释
 *
 * @author ningbo.zhao
 * @since 2018年04月01日
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EchoFinderProxyTest {
    @Test
    public void getProxy() throws Exception {
        EchoFinderProxy proxy = new EchoFinderProxy();
        PureService pureService = (PureService) proxy.getProxy(
                new PureServiceImpl(), new Class[]{PureService.class});
        pureService.echo("Hi");
        pureService.echoRandom("Hi");
        pureService.random("Hi");
    }

}