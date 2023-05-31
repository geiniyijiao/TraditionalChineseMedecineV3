<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86180
  Date: 2022/11/8
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="css/classes.css" rel="stylesheet" type="text/css"/>
    <title>药真的</title>
</head>

<script>
    function userLogout_classes() {
        if(confirm("您确定要退出吗？")){
            location.href="${pageContext.request.contextPath}/userLogout.do";
        }
    }

    function checkLogin_classes(){
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

    * {
        margin: 0;
        padding: 0;
    }

    #imgp {
        padding: 10px 10px 10px 10px;
        display: inline-block;
        width: 250px;
        height: 250px;
    }

    #detailbottom1 {
        color: black;
        text-decoration: none;
    }

    #detailbottom2 {
        color: black;
        text-decoration: none;
    }

    #h {
        display: inline-block;
        width: 200px;
        height: auto;
        text-align: center;
        padding-bottom: 10px;
    }

    .nav {
        background-color: #d3611f;
        width: 2536px;
        height: 40px;
        margin: 0 auto;
    }

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

<body>
<div class="padding">
    <%--顶部导航栏--%>
    <div class="nav">
        <ul>
            <li><a href="${pageContext.request.contextPath}/index.jsp">首页</a></li>
        </ul>
        <ul>
            <li>
<%--                href="${pageContext.request.contextPath}/classes.do"--%>
                <a onclick="checkLogin_classes()">全部分类</a>
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
            <ul>
                <li><a href="${pageContext.request.contextPath}/login.jsp">登录</a></li>
            </ul>
            <ul>
                <li><a href="${pageContext.request.contextPath}/register.jsp">注册</a></li>
            </ul>
        </c:if>
        <!-- 已经登录 -->
        <c:if test="${sessionScope.user!=null}">
            <ul>
            <li>${sessionScope.user.username}</li>
            </ul>
            <ul>
            <li><a onclick="userLogout_classes()">退出</a></li>
            </ul>
        </c:if>
    </div>
</div>
<%--顶部导航栏--%>

<%--判断是否选择全部分类--%>
<c:if test="${val!=null}">
    <div class="content">

        <div id="imgbox1" class="img">
            <c:forEach items="${mtList}" var="mt">
                <h1 class="titname">${mt.mTypeName}</h1>
                <span class="cc">
                <c:forEach items="${mList}" var="m">
                    <span class="bbox">
                    <c:if test="${m.mTypeId==mt.mTypeId}">
                        <img id="imgp" src="image/adminimage/${m.mName}.jpg"><br>
                        <h2 id="h"><a id="detailbottom1"
                                      href="${pageContext.request.contextPath}/detail.do?mId=${m.mId}">${m.mName}</a></h2>
                    </c:if>
                </span>
                </c:forEach>

                <div class="clear"></div>
            </span>
            </c:forEach>
        </div>

    </div>
</c:if>

<%--判断是否选择单个分类--%>
<c:if test="${val==null}">
    <div class="content">
        <div id="imgbox2" class="img">
            <h1 class="titname">${mt.mTypeName}</h1>
            <span class="cc">
                <c:forEach items="${mList}" var="m">
                    <span class="bbox">
                    <c:if test="${m.mTypeId==mt.mTypeId}">
                        <img id="imgp" src="image/adminimage/${m.mName}.jpg"><br>
                        <h2 id="h"><a id="detailbottom2"
                                      href="${pageContext.request.contextPath}/detail.do?mId=${m.mId}">${m.mName}</a></h2>
                    </c:if>
                </span>
                </c:forEach>
                <div class="clear"></div>
            </span>
        </div>

    </div>
</c:if>


</body>
</html>
