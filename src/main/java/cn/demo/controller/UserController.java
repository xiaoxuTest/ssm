package cn.demo.controller;

import cn.demo.entity.User;
import cn.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author huluxia
 * @description controller
 * @date 2020/4/14
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource(name = "userService")
    private  UserService userService;

    @RequestMapping(value = "/findAll")
//    @ResponseBody
    public String findAll(Model model){
        List<User> list = userService.findAll();
        model.addAttribute("userlist",list);
        return "list";
    }


}
