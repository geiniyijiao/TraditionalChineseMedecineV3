<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86180
  Date: 2022/11/6
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<script>
    function userLogout() {
        if(confirm("您确定要退出吗？")){
            location.href="${pageContext.request.contextPath}/userLogout.do";
        }
    }

    function checkLogin(){
        if (${sessionScope.user==null}){
            if (confirm("请您先登录，登录后才能查看全部分类！")){
                location.href="${pageContext.request.contextPath}/login.jsp";
            }
        }
        else {
            location.href="${pageContext.request.contextPath}/classes.do";
        }
    }
</script>

<style>
    a {
        color: white;
        text-decoration: none;
    }

    ul {
        list-style: none;
        margin-left: 80px;
        width: auto;
        height: auto;
    }

    ul li {
        float: left;
        line-height: 40px;
        text-align: center;
        position: relative;
    }

    a {
        display: inline-block;
        width: 110px;
        text-decoration: none;
        color: white;
        display: block;
        padding: 0 50px;
    }

    a:hover {
        color: #d3611f;
        background-color: #666;
    }

    ul li ul li {
        float: none;
        background-color: #666666;
        text-align: center;
        position: relative;
    }

    ul li ul {
        position: absolute;
        left: 10px;
        top: 40px;
        display: none;
    }

    ul li ul li a {
        font-size: 1px;
    }

    ul li ul li a:hover {
        background-color: #666666;
    }

    ul li:hover ul {
        display: block;
    }
</style>

<div class="nav left">
    <ul class="box box1">
        <li class="text1"><a href="${pageContext.request.contextPath}/index.jsp">首页</a></li>
    </ul>
    <ul class="box box1">
        <li class="text1">
<%--            href="${pageContext.request.contextPath}/classes.do"--%>
            <a onclick="checkLogin()">全部分类</a>
            <ul>
                <li><a href="${pageContext.request.contextPath}/classes.do?mTypeId=1">根类中药</a></li>
                <li><a href="${pageContext.request.contextPath}/classes.do?mTypeId=2">根茎类中药</a></li>
                <li><a href="${pageContext.request.contextPath}/classes.do?mTypeId=3">茎木类中药</a></li>
                <li><a href="${pageContext.request.contextPath}/classes.do?mTypeId=4">皮类中药</a></li>
                <li><a href="${pageContext.request.contextPath}/classes.do?mTypeId=5">叶类中药</a></li>
                <li><a href="${pageContext.request.contextPath}/classes.do?mTypeId=6">花类中药</a></li>
                <li><a href="${pageContext.request.contextPath}/classes.do?mTypeId=7">果实和种子类中药</a></li>
                <li><a href="${pageContext.request.contextPath}/classes.do?mTypeId=8">全草类中药</a></li>
                <li><a href="${pageContext.request.contextPath}/classes.do?mTypeId=9">藻、菌、地衣类中药</a></li>
                <li><a href="${pageContext.request.contextPath}/classes.do?mTypeId=10">其他类中药</a></li>
                <li><a href="${pageContext.request.contextPath}/classes.do?mTypeId=11">动物类中药</a></li>
                <li><a href="${pageContext.request.contextPath}/classes.do?mTypeId=12">矿物类中药</a></li>
                <li><a href="${pageContext.request.contextPath}/classes.do?mTypeId=13">树脂类中药</a></li>
            </ul>
        </li>
    </ul>
    <!-- 判断是否登录   sessionscope是关键字  -->
    <c:if test="${sessionScope.user==null}">
        <div class="box box2">
            <span class="text2"><a href="${pageContext.request.contextPath}/login.jsp">登录</a></span>
        </div>
        <div class="box box2">
            <span class="text2"><a href="${pageContext.request.contextPath}/register.jsp">注册</a></span>
        </div>
    </c:if>
    <!-- 判断是否登录   session  -->
    <!-- 已经登录 -->
    <c:if test="${sessionScope.user!=null}">
        <div class="box box2">
            <span class="text2">${sessionScope.user.username}</span>
        </div>
        <div class="box box2">
            <%--href="${pageContext.request.contextPath}/userLogout.do"--%>
            <span class="text2"><a onclick="userLogout()">退出</a></span>
        </div>
    </c:if>
    <!-- 已经登录 -->
</div>

</html>
