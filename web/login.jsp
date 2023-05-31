<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <link href="css/login.css" rel="stylesheet" type="text/css"/>
    <link href="css/index.css" rel="stylesheet" type="text/css"/>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>药真的</title>
</head>

<script>
    function checkUser() {
        var login_username = document.getElementById("username");
        var login_password = document.getElementById("password");
        if (login_username.value == "") {
            alert("用户名不能为空！请重新填入！");
            login_username.focus();
            return false;
        } else if (login_password.value == "") {
            alert("密码不能为空！请重新填入！");
            login_password.focus();
            return false;
        }
        return true;
    }

    function getError() {
        var error = "${error}";
        if(error!=""){
            alert(error);
        }
    }
</script>

<style>
    body {
        /* 设置背景渐变 */
        background-image: linear-gradient(to left,
        #d3611f, #e28131);
        display: flex;
        justify-content: center;
    }

    .small {
        color: #d3611f;
        text-decoration: none;
    }
</style>

<body onload="getError()">

<div>
    <div class="a">
        <div class="b"></div>
        <div class="c">
            <div class="d">
                <h1>药真的</h1>
                <form action="${pageContext.request.contextPath}/userLogin.do" method="get" enctype="text/plain"
                      onsubmit="return checkUser()">
                    <input id="username" name="username" type="text" class="e" placeholder="请输入账户名称" value="${newmu.username}">
                    <input id="password" name="password" type="password" class="e" placeholder="请输入密码">
                    <input type="submit" class="g" value="登录">
                    <a href="index.jsp" class="small"><strong>返回首页</strong></a>
                    <a href="register.jsp" class="small"><strong>注册</strong></a>
                </form>
            </div>
        </div>
    </div>
</div>

</body>

</html>