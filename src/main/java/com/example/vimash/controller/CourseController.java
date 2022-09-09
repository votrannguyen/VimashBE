package com.example.vimash.controller;


import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.dao.CustomerDao;
import com.example.vimash.services.CourseService;
import com.example.vimash.utils.ApiValidateException;
import com.example.vimash.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:4200/")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/api/course/{courseCode}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<ResultBean> finByCourse(@PathVariable String courseCode) {
        ResultBean resultBean = null;
        try {
            resultBean = courseService.getCourse(courseCode);
        } catch (ApiValidateException e) {
            resultBean = new ResultBean(e.getCode(), e.getField(), e.getMessage());
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        } catch (Exception ex) {

            resultBean = new ResultBean(Constants.STATUS_SYSTEM_ERROR, Constants.MESSAGE_SYSTEM_ERROR);
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
    }
}
