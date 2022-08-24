package com.example.vimash.bean.jpa.jpa;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name= "m_course")
public class CourseEntity implements Serializable {

    //Route Code
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_code")
    @JsonProperty(value="courseCode")
    private Long courseCode;

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
    private Long courseName;

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
    private String createBy;

    //Create Date
    @Column(name = "create_date")
    @JsonProperty("createDate")
    private Date createDate;

    //Update By
    @Column(name = "update_by")
    @JsonProperty("updateBy")
    private String updateBy;

    //Update Date
    @Column(name = "update_date")
    @JsonProperty("updateDate")
    private Date updateDate;

    public CourseEntity() {
    }

    //Contrutor có Id
    public CourseEntity(Long courseCode, Long companyId, String routeCode, Long courseName, String notes, String delFlg,
                        String createBy, Date createDate, String updateBy, Date updateDate) {
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
    public CourseEntity(Long companyId, String routeCode, Long courseName, String notes, String delFlg, String createBy,
                        Date createDate, String updateBy, Date updateDate) {
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
}
