package com.imooc;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class ExceptionHandler1 {

    @ExceptionHandler(value = Exception.class)
    public Object   errorHandle(HttpServletRequest req, HttpServletResponse resp, Exception e){

        e.printStackTrace();
        ModelAndView mod = new ModelAndView();
        mod.addObject("exceptin", e);
        mod.addObject("url", req.getRequestURI());
        mod.setViewName("error");

        return mod;
    }
}
