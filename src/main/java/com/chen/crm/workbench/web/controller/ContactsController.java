package com.chen.crm.workbench.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactsController {


    @RequestMapping("/workbench/contacts/index.do")
    public String index(){
        //请求转发到联系人的主页面
        return "forward:/WEB-INF/pages/workbench/contacts/index.html";
    }


}
