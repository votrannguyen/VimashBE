package com.example.vimash.bean.jpa.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CourseResponse {
    @JsonProperty("courseCode")
    private String courseCode;

    //Customer Name
    @JsonProperty("courseName")
    private String courseName;

    public CourseResponse() {
    }

    public CourseResponse(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
