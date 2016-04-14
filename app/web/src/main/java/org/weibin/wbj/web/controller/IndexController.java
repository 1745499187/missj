package org.weibin.wbj.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by weibin on 2016/01/22.
 */
@Controller
public class IndexController {

    @RequestMapping("/index.htm")
    public String onNotFound() {
        return "index/index";
    }
}
