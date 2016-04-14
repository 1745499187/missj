package org.weibin.wbj.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by weibin on 2016/01/22.
 */
@Controller
public class ExceptionController {

    @RequestMapping("/oops/notfound.htm")
    public String onNotFound() {
        return "global/notfound";
    }

    @RequestMapping("/oops/error.htm")
    public String onError() {
        return "global/error";
    }

    @RequestMapping("/oops/accessdenied.htm")
    public String onAccessDenied() {
        return "global/accessdenied";
    }
}
