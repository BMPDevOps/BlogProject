<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" type="text/css" href="/css/blog.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">
<link href="https://fonts.googleapis.com/css2?family=Caveat:wght@400..700&family=Dancing+Script:wght@400..700&family=East+Sea+Dokdo&family=Jua&family=Gaegu&family=Gamja+Flower&family=Pacifico&family=Single+Day&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>

<link rel="stylesheet" type="text/css" href="/css/blog.css">
<script src="js/blog.js"></script>

<body>
    <header class="head" id="userPost">
        <span>${dto.id}의 블로그</span>
    </header>
    <c:if test="${dto.id == sessionScope.id}">
        <div class="writeButton">
            <button type="button" id="writeButton" onclick="location.href='/postWrite'">글쓰기</button>
        </div>
    </c:if>
    <div id="postList" class="postList">

    </div>

</body>
</html>
