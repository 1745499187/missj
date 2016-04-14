package org.weibin.wbj.service.impl;

import org.weibin.wbj.service.TestService;

/**
 * Created by weibin on 2016/01/22.
 */
public class TestServiceImpl implements TestService {

    public String sayHello(String who) {
        return "Hello, " + who;
    }
}
