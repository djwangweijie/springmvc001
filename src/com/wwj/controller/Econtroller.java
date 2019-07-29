package com.wwj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wwj.exception.ServiceException;

@Controller
public class Econtroller {

    /**
     * 测试返回异常信息
     * @return
     */
    @RequestMapping("/exception")
    public void returnExceptionInfo() {

        if (1 != 2) {
            // 用户民错误或不存在异常
            throw new ServiceException("错误");
        }

   
    }
}
