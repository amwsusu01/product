package com.hanergy.reportForms.dto.beselected;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @ClassName CanEducationDTO
 * @Description TODO
 * @Author DURONGHONG
 * @DATE 2018/9/21 17:23
 * @Version 1.0
 **/
@ApiModel(value = "候选人教育背景", description = "候选人教育背景")
public class CanEducationDTO implements Serializable {

    @ApiModelProperty(value = "学校", example = "北京大学")
    private String school;

    @ApiModelProperty(value = "入学日期", example = "2001-09")
    private String schoolStart;

    @ApiModelProperty(value = "毕业日期", example = "2005-07")
    private String graduationDate;

    @ApiModelProperty(value = "专业", example = "计算机科学")
    private String major;

    @ApiModelProperty(value = "学历（最高）：1大专   2本科   3硕士   4博士   0其它", example = "2")
    private Integer education;

    @ApiModelProperty(value = "学历性质（教育类型）：1全日制   2非全日制   0其它", example = "1")
    private Integer educationType;

    @ApiModelProperty(value = "学位", example = "学士")
    private String degree;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchoolStart() {
        return schoolStart;
    }

    public void setSchoolStart(String schoolStart) {
        this.schoolStart = schoolStart;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getEducationType() {
        return educationType;
    }

    public void setEducationType(Integer educationType) {
        this.educationType = educationType;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
