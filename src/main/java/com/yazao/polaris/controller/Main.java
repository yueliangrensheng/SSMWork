package com.yazao.polaris.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhaishaoping on 2018/6/11.
 */
@Controller
public class Main {

    @RequestMapping("/download")
    @ResponseBody
    public String index(){
        return "AppRelease";
    }


}
