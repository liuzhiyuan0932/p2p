package com.p2p.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhiyuan on 2017/12/14.
 */

@RestController
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "success";
    }
}
