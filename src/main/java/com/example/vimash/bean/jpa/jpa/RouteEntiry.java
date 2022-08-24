package com.example.vimash.bean.jpa.jpa;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * [OVERVIEW] : T  Customer Info Of Entity.
 *
 * @author: (VIMASH)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/08/24      (VIMASH)         Create new
 */


@Entity
@Table(name= "m_route")
public class RouteEntiry implements Serializable {

    //Route Code
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "route_code")
    @JsonProperty(value="routeCode")
    private Long routeId;

    //Company Id
    @Column(name = "company_id")
    @JsonProperty(value="companyId")
    private Long companyId;

    //Route Name
    @Column(name = "route_name")
    @JsonProperty(value="routeName")
    private String routeName;

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

    public RouteEntiry() {
    }

    //Contructor có Id
    public RouteEntiry(Long routeId, Long companyId, String routeName, String notes, String delFlg, String createBy,
                       Date createDate, String updateBy, Date updateDate) {
        this.routeId = routeId;
        this.companyId = companyId;
        this.routeName = routeName;
        this.notes = notes;
        this.delFlg = delFlg;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
    }

    //Contructor không có Id
    public RouteEntiry(Long companyId, String routeName, String notes, String delFlg, String createBy, Date createDate,
                       String updateBy, Date updateDate) {
        this.companyId = companyId;
        this.routeName = routeName;
        this.notes = notes;
        this.delFlg = delFlg;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
    }

    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
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

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
