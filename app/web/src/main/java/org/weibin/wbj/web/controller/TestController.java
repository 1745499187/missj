package org.weibin.wbj.web.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.weibin.wbj.service.TestService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by weibin on 2016/01/22.
 */
@Controller
@RequestMapping("/test.htm")
public class TestController {

    private TestService testService;

    @RequestMapping(method= RequestMethod.GET)
    public String doGet() {

        return "test/test";
    }

    @RequestMapping(method= RequestMethod.POST)
    public String doPost(HttpServletRequest request, ModelMap modelMap) {
        String who = request.getParameter("who");
        if(StringUtils.equals(who, "error")) {
            throw new RuntimeException("报错了,咋地");
        }
        modelMap.addAttribute("greetingMsg", testService.sayHello(who));
        return "test/test";
    }

    public void setTestService(TestService testService) {
        this.testService = testService;
    }
}
