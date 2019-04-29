<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><html lang="en">
<h3>一行 Java 代码</h3>
<p>
    Date today is <%= (new java.util.Date())%>
</p>
<h3>多行 Java 代码</h3>
<p>Your IP Address is :
<%
    out.println("Your IP address is "+request.getRemoteAddr()+"</br>");
    out.println("一段代码");
%>
</p>

<h3>For循环实例</h3>
<%
    int count=(int) session.getAttribute("count");
    for(int fontSize=1;fontSize<=count;fontSize++){
      %>
A good smile<br/>
<%}%>

<h3>标签 c:if</h3>
<c:if test="${username!=null}">
<p>用户名为:${username}</p>
</c:if>

<h3>标签 c:choose</h3>
<c:choose>
    <c:when test="${salary<=0}">
        要死了
    </c:when>
    <c:when test="${salary>2000}">
        极其有钱
    </c:when>
    <c:when test="${salary>1000}">
        可以存活
    </c:when>
    <c:otherwise>
         啥也没有
    </c:otherwise>
</c:choose>

<h3>布局</h3>
<%@include file="footer.jsp"%>
<jsp:include page="footer.jsp" flush="true"/>