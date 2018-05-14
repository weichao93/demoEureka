package com.comcontroller;

import com.etoaks.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 11:28 2017/9/9 0009
 */
@Controller
public class TestCntroller
{
    @RequestMapping("/helloftl")
    public String helloftl(Map<String,Object> map)
    {

        map.put("name","Dear");
        return "helloftl";
    }

    @RequestMapping("/hellohtml")
    public String hellojsp(Model model)
    {

        // ModelAndView modelAndView = new ModelAndView("hellohtml");
        model.addAttribute("name","fenfen");
        return "hellohtml";
    }


}
