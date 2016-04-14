package org.weibin.wbj.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by weibin on 2016/02/05.
 */

@Controller
public class MiscController {

    @RequestMapping("/about.htm")
    public String about() {
        return "global/about";
    }
}
