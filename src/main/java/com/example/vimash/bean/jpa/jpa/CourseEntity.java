package com.example.vimash.bean.jpa.jpa;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name= "m_course")
public class CourseEntity implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8272902425374331095L;

	//Route Code
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_code")
    @JsonProperty(value="courseCode")
    private Integer courseCode;

    //Company Id
    @Column(name = "company_id")
    @JsonProperty(value="companyId")
    private Long companyId;

    //Route Code
    @Column(name = "route_code")
    @JsonProperty(value="routeCode")
    private String routeCode;

    //Course Name
    @Column(name = "course_name")
    @JsonProperty(value="courseName")
    private String courseName;

    //Note
    @Column(name = "notes")
    @JsonProperty(value="notes")
    private String notes;

    //Delete Column
    @Column(name = "del_flg")
    @JsonProperty(value="delFlg")
    private String delFlg;

    //Create By
    @Column(name = "create_by")
    @JsonProperty("createBy")
    private Integer createBy;

    //Create Date
    @Column(name = "create_date")
    @JsonProperty("createDate")
    private Date createDate;

    //Update By
    @Column(name = "update_by")
    @JsonProperty("updateBy")
    private Integer updateBy;

    //Update Date
    @Column(name = "update_date")
    @JsonProperty("updateDate")
    private Date updateDate;

    public CourseEntity() {
    }

    //Contrutor có Id
    public CourseEntity(Integer courseCode, Long companyId, String routeCode, String courseName, String notes, String delFlg,
                        Integer createBy, Date createDate, Integer updateBy, Date updateDate) {
        this.courseCode = courseCode;
        this.companyId = companyId;
        this.routeCode = routeCode;
        this.courseName = courseName;
        this.notes = notes;
        this.delFlg = delFlg;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
    }

    //Contrutor không có Id
    public CourseEntity(Long companyId, String routeCode, String courseName, String notes, String delFlg, Integer createBy,
                        Date createDate, Integer updateBy, Date updateDate) {
        this.companyId = companyId;
        this.routeCode = routeCode;
        this.courseName = courseName;
        this.notes = notes;
        this.delFlg = delFlg;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
    }

    public Integer getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(Integer courseCode) {
        this.courseCode = courseCode;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
