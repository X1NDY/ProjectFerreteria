package com.ingenieria.application;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/producto")
public class ProductController {


    @GetMapping("lista")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/producto/lista");
        return mv;
    }

    @GetMapping("nuevo")
    public String nuevo() {
        return "producto/nuevo";
    }

    @GetMapping("editar")
    public ModelAndView editar() {
        return new ModelAndView("/producto/editar");
    }

}
