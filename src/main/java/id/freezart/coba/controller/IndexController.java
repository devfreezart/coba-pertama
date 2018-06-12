package id.freezart.coba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
    public ModelAndView IndexAction(){
        ModelAndView view = new ModelAndView("index");

        return view;
    }

}
