<%--
  Created by IntelliJ IDEA.
  User: 86180
  Date: 2022/11/6
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <link href="css/text.css" rel="stylesheet" type="text/css"/>
    <link href="css/index.css" rel="stylesheet" type="text/css"/>
    <title>药真的</title>
</head>

<script>

    function tempClick() {
        //火狐浏览器实现点击图片出现文件上传界面
        var a = document.createEvent("MouseEvents");
        a.initEvent("click", true, true);
        document.getElementById("up").dispatchEvent(a);
        // //IE浏览器实现点击图片出现文件上传界面
        // document.getElementById('up').click();   //调用main_img的onclick事件
    }

    function checkUserUpLoadImg() {
        var filename=document.getElementById("up").value;
        var index=filename.lastIndexOf(".");
        if(index!=-1){
            var ext=(filename.substring(index + 1, filename.length)).toLowerCase();
            var array=["jpg","png","bmp", "jpeg", "tif"];
            for(var i=0;i<array.length;i++){
                if(array[i]==ext){
                    return true;
                }
            }
        }
        alert("上传文件格式必须是jpg,jpeg,png,bmp,tif!");
        return false;
    }

    //上传图片后预览图片
    function viewImage(file) {
        var preview = document.getElementById('upimg');
        if (file.files && file.files[0]) {
            //火狐下
            preview.style.display = "block";
            preview.style.width = "224px";
            preview.style.height = "224px";
            preview.src = window.URL.createObjectURL(file.files[0]);
        } else {
            //ie下，使用滤镜
            file.select();
            var imgSrc = document.selection.createRange().text;
            var localImagId = document.getElementById("upimg");
            //必须设置初始大小
            localImagId.style.width = "224px";
            localImagId.style.height = "224px";
            try {
                localImagId.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
                locem("DXImageTransform.Microsoft.AlphaImageLoader").src = imgSrc;
            } catch (e) {
                alert("您上传的图片格式不正确，请重新选择!");
                return false;
            }
            preview.style.display = 'none';
            document.selection.empty();
        }
        return true;
    }

</script>

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

    <div class="center">
        <img id="upimg" width="224" height="224" src="image/adminimage/upload.jpg" alt="请上传图片" onclick="tempClick()">
        <form action="${pageContext.request.contextPath}/imgIdentity.do" enctype="multipart/form-data" method="post" onsubmit="return checkUserUpLoadImg()">
            <label> 上传图片 </label>
            <input id="up" name="file" type="file" class="opt_input" onchange="viewImage(this)"/>
            <input class="bottom identitybtn" type="submit" value="识别"/>
        </form>
    </div>

</div>

<%--<div class="main"><span>你好</span></div>--%>
</body>

</html>
