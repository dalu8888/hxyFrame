
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/taglib.jsp" %>
<div id="actBusFields">
    <div class="row">
        <div class="form-group col-sm-6 col-md-5 ">
            <label class="col-sm-3 control-label no-padding-right">标题:</label>
            <div class="col-sm-9">
                <span class="col-xs-11 block input-icon input-icon-right">
                    <input id="title" name="title" type="text"  class="form-control" value="${declare.title}" readonly/>
                </span>
            </div>
        </div>
        <div class="form-group col-sm-6 col-md-5 ">
            <label class="col-sm-3 control-label no-padding-right">是否在评审管理中评审:</label>
            <div class="col-sm-9">
            <span class="col-xs-11 block input-icon input-icon-right">
                <input id="isreview" name="isreview" type="text"  class="form-control" value="${declare.isreview}" readonly/>
            </span>
            </div>
        </div>
        <div class="form-group col-sm-6 col-md-5 ">
            <label class="col-sm-3 control-label no-padding-right">研究院评审是否通过:</label>
            <div class="col-sm-9">
            <span class="col-xs-11 block input-icon input-icon-right">
                <input id="ispassbyyjy" name="ispassbyyjy" type="text"  class="form-control" value="${declare.ispassbyyjy}" readonly/>
            </span>
            </div>
        </div>

        <div class="form-group col-sm-6 col-md-5 ">
            <label class="col-sm-3 control-label no-padding-right">评分标准:</label>
            <div class="col-sm-9">
                <span class="col-xs-11 block input-icon input-icon-right">
                    <input id="evaluation" name="evaluation" type="text"  class="form-control" value="${declare.evaluation}" readonly/>
                </span>
            </div>
        </div>
        <div class="form-group col-sm-6 col-md-5 ">
            <label class="col-sm-3 control-label no-padding-right">初审开始时间:</label>
            <div class="col-sm-9">
                <span class="col-xs-11 block input-icon input-icon-right">
                    <input id="firsttrialstart_time" name="firsttrialstart_time" type="text"  class="form-control" value="${declare.firsttrialstart_time}" readonly/>
                </span>
            </div>
        </div>
        <div class="form-group col-sm-6 col-md-5 ">
            <label class="col-sm-3 control-label no-padding-right">初审结束时间:</label>
            <div class="col-sm-9">
                <span class="col-xs-11 block input-icon input-icon-right">
                    <input id="firsttrialend_time" name="firsttrialend_time" type="text"  class="form-control" value="${declare.firsttrialend_time}" readonly/>
                </span>
            </div>
        </div>

    </div>
    <div class="row">
        <div class="form-group col-sm-6 col-md-5 ">
            <label class="col-sm-3 control-label no-padding-right">项目描述:</label>
            <div class="col-sm-9">
            <span class="col-xs-11 block input-icon input-icon-right">
                <input id="info" name="info" type="text"  class="form-control" value="${declare.info}" readonly/>
            </span>
            </div>
        </div>
        <div class="form-group col-sm-6 col-md-5 ">
            <label class="col-sm-3 control-label no-padding-right">编号:</label>
            <div class="col-sm-9">
            <span class="col-xs-11 block input-icon input-icon-right">
                <input id="code" name="code" type="text"  class="form-control" value="${declare.code}" readonly/>
            </span>
            </div>
        </div>
    </div>
</div>
<c:if test="${flag == 2}">
    <%@include file="../activiti/processComSub.jsp"%>
</c:if>

