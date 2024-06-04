<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">
<link href="https://fonts.googleapis.com/css2?family=Caveat:wght@400..700&family=Dancing+Script:wght@400..700&family=East+Sea+Dokdo&family=Jua&family=Gaegu&family=Gamja+Flower&family=Pacifico&family=Single+Day&display=swap" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
    <link rel="stylesheet" type="text/css" href="/css/main.css">
    <script src="js/main.js"></script>
</head>
<body>

<header class="loginButton">
    <c:if test="${sessionScope.id == null}">
        <button type="button" id="loginButton" onclick="location.href='/login'">login</button>
    </c:if>
    <c:if test="${sessionScope.id != null}">
        <button type="button" id="logoutButton" onclick="location.href='/logout'">logout</button>
    </c:if>
</header>

<div class="title">
    <span class="title">메인 게시판</span>
</div>

<div class="mainBoard">
    <div class="listMap">
        <span >리스트 목록</span>
    </div>
    <br>
    <div class="listPost">
        <div id="postPrint"></div>
    </div>

</div>

</body>
</html>