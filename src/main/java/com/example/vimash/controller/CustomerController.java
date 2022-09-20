package com.example.vimash.controller;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.services.CourseService;
import com.example.vimash.services.CustomerService;
import com.example.vimash.services.RouteService;
import com.example.vimash.utils.ApiValidateException;
import com.example.vimash.utils.Constants;
import org.hibernate.annotations.Parameter;
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
    @Resource
    private CourseService courseService;

    // GET CUSTOMERS
    @RequestMapping(value = "/api/customers", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<ResultBean> getCustomer(@RequestParam(defaultValue = "1") Integer page,
                                                  @RequestParam(defaultValue = "10") Integer size,
                                                  @RequestParam(defaultValue = "") String name,
                                                  @RequestParam(defaultValue = "") String code1,
                                                  @RequestParam(defaultValue = "") String code2){

        ResultBean resultBean = null;
        try {
            resultBean = customerService.getCustomer(page, size, name, code1, code2);
        } catch (ApiValidateException e) {
            resultBean = new ResultBean(e.getCode(), e.getField(), e.getMessage());
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        } catch (Exception ex) {

            resultBean = new ResultBean(Constants.STATUS_SYSTEM_ERROR, Constants.MESSAGE_SYSTEM_ERROR);
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
    }

    // GET SINGER CUSTOMER
    @RequestMapping(value = "/api/customer/{id}", method = RequestMethod.GET)
    public ResponseEntity<ResultBean> getSingerCustomer(@PathVariable Long id) {
        ResultBean resultBean = null;
        try {
            resultBean = customerService.findSingleCustomer(id);
        } catch (ApiValidateException e) {
            resultBean = new ResultBean(e.getCode(), e.getField(), e.getMessage());
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        }catch (Exception ex) {
            resultBean = new ResultBean("304",null,ex.getMessage());
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
    };

    // DELETE SINGLE CUSTOMER
    @RequestMapping(value = "/api/customer/{id}", method = RequestMethod.DELETE, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<ResultBean> deleteSingerCustomer(@PathVariable Long id) {
        ResultBean resultBean = null;
        try {
        resultBean = customerService.deleteSingleCustomer(id);

        } catch (ApiValidateException e) {
            resultBean = new ResultBean(e.getCode(), e.getField(), e.getMessage());
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        }catch (Exception ex) {
            resultBean = new ResultBean("304",null,ex.getMessage());
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
    };

    // ADD SINGLE CUSTOMER
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


    @RequestMapping(value = "/api/courses", method = RequestMethod.GET)
    public ResponseEntity<ResultBean> getAllCourse() {

        ResultBean resultBean = null;
        try {
            resultBean = courseService.getAll();
        } catch (Exception e) {
            resultBean = new ResultBean("404", "error");
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.valueOf("4044"));
        }
        return new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
    }
}
