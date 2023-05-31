<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86180
  Date: 2022/11/9
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>药真的</title>
    <link href="css/text.css" rel="stylesheet" type="text/css"/>
    <link href="css/index.css" rel="stylesheet" type="text/css"/>
</head>

<style>

    body {
        background-image: url("image/adminimage/indexbackgroundv2.jpg");
    }

    a {
        color: white;
        text-decoration: none;
    }

</style>

<body>

<jsp:include page="index/index_left.jsp"></jsp:include>

<div>

    <div class="left">
        <span class="textleft">药材用法：${me.mUse}
        </span>
    </div>
    <div class="right">
        <span class="textright">药材注意事项：${me.mAttention}</span>
    </div>

    <div class="right">
        <div class="box box3">
                <span class="text1">
                    <a href="${pageContext.request.contextPath}/detail.do?mId=${me.mId}">${me.mName}
                    </a>
                </span>
        </div>
        <div class="box box4">
                <span class="text2">
                    <a href="${pageContext.request.contextPath}/classes.do?mTypeId=${me.mTypeId}">${mTypeName}
                    </a>
                </span>
        </div>
    </div>

    <div class="center">
        <img id="upimg" width="224" height="224" src="index/showImg.jsp?path=${file}" alt="请上传图片">
        <p>
            <label> ${me.mName} </label>
        </p>
    </div>

    <div class="bottom">
        <span>
            药材性状：${me.mTrait}
        </span>
    </div>
    <div class="bottom">
        <span>
            药材作用：${me.mAffect}
        </span>
    </div>
</div>
</body>
</html>
