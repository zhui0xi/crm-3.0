package com.chen.crm.workbench.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {


    @RequestMapping("/workbench/customer/index.do")
    public String index(){
        //请求转发到客户的主页面
        return "forward:/WEB-INF/pages/workbench/customer/index.html";
    }



}
