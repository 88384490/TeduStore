<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style>
        body{
            font-size: 30px;
        }
    </style>
    <title>Title</title>
</head>
<body>
    <%--
        1.method="post"
        2.enctype="multipart/form-data"
    --%>
    <form action="${pageContext.request.contextPath}/upload/uploadFile.do" method="post"
          enctype="multipart/form-data">
        请选中文件: <input type="file" name="file" id="file">
        <br/>
        <input type="submit" value="上传文件">
    </form>
</body>
</html>
