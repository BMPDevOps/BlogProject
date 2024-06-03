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
   <link rel="stylesheet" type="text/css" href="../css/searchPwd.css">
</head>
<body>
    <div class="container">
        <div class="find-password-box">
            <h2>비밀번호 찾기</h2>
            <form id="find-password-form">
                <div class="input-group">
                    <label for="name">이름</label>
                    <input type="text" id="name" name="name" required>
                </div>
                <div class="input-group">
                    <label for="username">아이디</label>
                    <input type="text" id="username" name="username" required>
                </div>
                <div class="input-group">
                    <label for="phone">전화번호</label>
                    <input type="text" id="phone" name="phone" required>
                </div>
                <div class="input-group">
                    <label for="email">이메일</label>
                    <input type="email" id="email" name="email" required>
                </div>
                <button type="submit">비밀번호 찾기</button>
            </form>
        </div>
    </div>
</body>
</html>