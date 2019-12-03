package cn.nuc.edu.yushu.springlearning001.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: yushu
 * 2019/12/3 21:27
 * @description:
 */

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
