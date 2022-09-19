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

@RestController
@CrossOrigin("http://localhost:4200")
public class CustomerController {

    @Resource
    private CustomerService customerService;
    @RequestMapping(value = "/api/customer", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<ResultBean> getCustomer() {
        ResultBean resultBean = null;
        try {
            resultBean = customerService.getCustomer();
        } catch (ApiValidateException e) {
            resultBean = new ResultBean(e.getCode(), e.getField(), e.getMessage());
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        } catch (Exception ex) {

            resultBean = new ResultBean(Constants.STATUS_SYSTEM_ERROR, Constants.MESSAGE_SYSTEM_ERROR);
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
    }
//    @RequestMapping(value = "/api/customers", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
//    public ResponseEntity<ResultBean> getCustomer(@RequestBody String json){
//
//        ResultBean resultBean = null;
//        try {
//            resultBean = customerService.getCustomer(json);
//        } catch (ApiValidateException e) {
//            resultBean = new ResultBean(e.getCode(), e.getField(), e.getMessage());
//            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
//        } catch (Exception ex) {
//
//            resultBean = new ResultBean(Constants.STATUS_SYSTEM_ERROR, Constants.MESSAGE_SYSTEM_ERROR);
//            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
//        }
//        return new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
//    }

    @RequestMapping(value = "/api/customer/{id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<ResultBean> finByIdCustomer(@PathVariable Integer id) {
        ResultBean resultBean = null;
        try {
            resultBean = customerService.findByIdCustomer(id);
        } catch (ApiValidateException e) {
            resultBean = new ResultBean(e.getCode(), e.getField(), e.getMessage());
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
        } catch (Exception ex) {

            resultBean = new ResultBean(Constants.STATUS_SYSTEM_ERROR, Constants.MESSAGE_SYSTEM_ERROR);
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
        }
        return new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
    }
    @RequestMapping(value = "/customercode/{code}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<ResultBean> finByCustomerCode(@PathVariable String code) {
        ResultBean resultBean = null;
        try {
            resultBean = customerService.findByCustomerCode(code.trim());
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
        }catch (Exception e) {
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
    }
    @RequestMapping(value = "/api/customer", method = RequestMethod.PUT, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<ResultBean> updateCustomer(@RequestBody  String jsonCustomer){
        ResultBean resultBean = null;
        try{
            resultBean = customerService.updateCustomer(jsonCustomer);

        }
        catch (ApiValidateException e) {
            resultBean = new ResultBean(e.getCode(), e.getField(), e.getMessage());
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        }catch (Exception e) {
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
    }
    @RequestMapping(value = "/api/customer/{id}", method = RequestMethod.DELETE, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<ResultBean> deleteCustomer(@PathVariable  Integer id){
        ResultBean resultBean = null;
        try{
            resultBean = customerService.deleteCustomer(id);

        }
        catch (ApiValidateException e) {
            resultBean = new ResultBean(e.getCode(), e.getField(), e.getMessage());
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        }catch (Exception e) {
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
    }


}
