package org.weibin.wbj.web.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by weibin on 2016/02/02.
 */
@Controller
@RequestMapping("/login.htm")
public class LoginController {

    @RequestMapping(method= RequestMethod.GET)
    public String doGet(HttpServletRequest request, ModelMap modelMap) {
        String error = request.getParameter("error");
        if(error != null) {
            modelMap.put("isError", "true");
        }
        return "global/login";
    }

}
