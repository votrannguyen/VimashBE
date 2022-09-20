package com.example.vimash.controller;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.services.CustomerService;
import com.example.vimash.services.RouteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class RouteController {

    @Resource
    private RouteService routeService;

    @RequestMapping(value = "/api/routess", method = RequestMethod.GET)
    public ResponseEntity<ResultBean> getAll() {

        ResultBean resultBean = null;
        try {
            resultBean = routeService.getAll();
        } catch (Exception e) {
            resultBean = new ResultBean("1000", "error");
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.valueOf("1000"));
        }
        return new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
    }
}
