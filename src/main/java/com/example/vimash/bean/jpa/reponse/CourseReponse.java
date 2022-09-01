package com.example.vimash.bean.jpa.reponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CourseReponse {
	@JsonProperty(value="courseCode")
    private String courseCode;
	
	 @JsonProperty(value="courseName")
	 private String courseName;

	/**
	 * @param courseCode
	 * @param courseName
	 */
	public CourseReponse(String courseCode, String courseName) {
		super();
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
