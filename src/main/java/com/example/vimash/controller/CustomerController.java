package com.example.vimash.controller;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.services.CustomerService;
import com.example.vimash.utils.ApiValidateException;
import com.example.vimash.utils.Constants;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class CustomerController {

    @Resource
    private CustomerService customerService;
    @RequestMapping(value = "/api/customer", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<ResultBean> getCustomer(
            @RequestParam (defaultValue = "") String name
            ,@RequestParam (defaultValue = "") String code1
            ,@RequestParam (defaultValue = "")String code2
            ,@RequestParam (defaultValue = "10")Integer size
            ,@RequestParam (defaultValue = "1")Integer page) {
        ResultBean resultBean = null;
        try {
            resultBean = customerService.getCustomer(name, code1, code2, page, size);
        } catch (ApiValidateException e) {
            resultBean = new ResultBean(e.getCode(), e.getField(), e.getMessage());
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        } catch (Exception ex) {

            resultBean = new ResultBean(Constants.STATUS_SYSTEM_ERROR, Constants.MESSAGE_SYSTEM_ERROR);
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/customer", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<ResultBean> addCustomer(@RequestBody  String jsonCustomer){
        ResultBean resultBean = null;
        try{
            resultBean = customerService.addCustomer(jsonCustomer);

        }
        catch (ApiValidateException e) {
            resultBean = new ResultBean(e.getCode(), e.getField(), e.getMessage());
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        }catch (Exception ex) {
            resultBean = new ResultBean(null,null,ex.getMessage());
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
    }
}
