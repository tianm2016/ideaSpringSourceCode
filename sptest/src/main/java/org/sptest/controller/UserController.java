package org.sptest.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.sptest.po.User;
import org.sptest.service.IUserService;

/**
 * Created by Administrator on 2017/3/23 0023.
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userServiceImpl;

    @RequestMapping("/testGardleSpring")
    public ModelAndView testRedis(HttpServletRequest request, HttpServletResponse response) throws Exception {

        Map<String, Object> model = new HashMap<String, Object>();

        User user=userServiceImpl.getUser();

        model.put("result", "success"+user.getUserId()+"---"+user.getUserName());

        return new ModelAndView("result").addAllObjects(model);
    }
}
