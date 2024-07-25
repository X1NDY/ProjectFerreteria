package com.ingenieria.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/inventario")
public class InventarioControler {


    @GetMapping("lista")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/inventario/lista");
        return mv;
    }

}

