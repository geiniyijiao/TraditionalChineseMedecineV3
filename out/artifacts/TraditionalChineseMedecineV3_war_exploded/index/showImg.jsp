<%--
  Created by IntelliJ IDEA.
  User: 86180
  Date: 2022/11/10
  Time: 2:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.io.File" %>
<%@ page import="java.io.FileInputStream" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String path = request.getParameter("path");
    if (path == null || path.isEmpty()) {
        return;
    }
    File file = new File(path);
    if (!file.exists() || file.isDirectory()) {
        return;
    }
    FileInputStream fileInputStream = new FileInputStream(file);
    ServletOutputStream outputStream = response.getOutputStream();
    byte bs[] = new byte[1024];
    int l;
    while ((l = fileInputStream.read(bs)) != -1) {
        outputStream.write(bs, 0, l);
    }
    outputStream.flush();
    outputStream.close();
    fileInputStream.close();
%>
</body>
</html>

