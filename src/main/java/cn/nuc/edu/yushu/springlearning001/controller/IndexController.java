package cn.nuc.edu.yushu.springlearning001.controller;

import cn.nuc.edu.yushu.springlearning001.dto.QuestionDTO;
import cn.nuc.edu.yushu.springlearning001.mapper.QuestionMapper;
import cn.nuc.edu.yushu.springlearning001.mapper.UserMapper;
import cn.nuc.edu.yushu.springlearning001.model.Question;
import cn.nuc.edu.yushu.springlearning001.model.User;
import cn.nuc.edu.yushu.springlearning001.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author: yushu
 * 2019/12/3 21:27
 * @description:
 */

@Controller
public class IndexController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private QuestionService questionService;
    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model){
        Cookie[]  cookies = request.getCookies();
        for(Cookie cookie:cookies){
            if(cookie.getName().equals("token")){
                String token = cookie.getValue();
                User user = userMapper.findByToken(token);
                if(user!=null){
                    request.getSession().setAttribute("user",user);
                }
                break;
            }
        }

        List<QuestionDTO> questions =questionService.list();
        model.addAttribute("questions",questions);
        return "index";
    }

}
