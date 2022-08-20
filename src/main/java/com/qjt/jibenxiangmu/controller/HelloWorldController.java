/*
 * @Author: 秦景涛 916996437@qq.com
 * @Date: 2022-08-20 09:39:25
 * @LastEditors: 秦景涛 916996437@qq.com
 * @LastEditTime: 2022-08-20 09:51:15
 * @FilePath: \jibenxiangmu\src\main\java\com\qjt\jibenxiangmu\controller\HelloWorldController.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package com.qjt.jibenxiangmu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/admin")
public class HelloWorldController {

    @ResponseBody
    @RequestMapping("/helloWorld")
    public String helloWorld(){
        return "Hello World";
    }
}
