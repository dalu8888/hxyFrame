package com.hxy.demo.entity;

import com.hxy.activiti.annotation.ActField;
import com.hxy.activiti.annotation.ActTable;
import com.hxy.base.entity.ActivitiBaseEntity;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by asus on 2018/1/13.
 */
@ActTable(tableName = "declareaply",pkName="id")
public class DeclareEntity extends ActivitiBaseEntity {
    private String id;

    private String userId;

    @ActField(name = "申报项目标题")
    @NotEmpty(message = "申报项目标题不能为空")
    private String title;

    @ActField(name = "是否需要评审管理",isJudg = true)
    private int isreview;

    @ActField(name = "初审开始时间")
    private String firsttrialstart_time;  //初审开始时间 TO DO 类型换成Date

    @ActField(name = "初审结束时间")
    private String firsttrialend_time;  //初审结束时间

    @ActField(name = "评分标准")
    private String evaluation; //评分标准

    @ActField(name = "研究院评审是否通过",isJudg = true)
    private int ispassbyyjy;
    /**
     * 项目信息
     */
    @ActField(name = "申报项目描述")
    @NotEmpty(message = "申报项目描述不能为空")
    private String info;

    /**
     * 申请人姓名
     */
    private String declareUser;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDeclareUser() {
        return declareUser;
    }

    public void setDeclareUser(String declareUser) {
        this.declareUser = declareUser;
    }


    public int getIsreview() {
        return isreview;
    }

    public void setIsreview(int isreview) {
        this.isreview = isreview;
    }

    public int getIspassbyyjy() {
        return ispassbyyjy;
    }

    public void setIspassbyyjy(int ispassbyyjy) {
        this.ispassbyyjy = ispassbyyjy;
    }

    public String getFirsttrialstart_time() {
        return firsttrialstart_time;
    }

    public void setFirsttrialstart_time(String firsttrialstart_time) {
        this.firsttrialstart_time = firsttrialstart_time;
    }

    public String getFirsttrialend_time() {
        return firsttrialend_time;
    }

    public void setFirsttrialend_time(String firsttrialend_time) {
        this.firsttrialend_time = firsttrialend_time;
    }
}
