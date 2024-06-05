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

    <link rel="stylesheet" type="text/css" href="/css/postWrite.css">
    <script src="/js/postWrite.js"></script>

</head>
<body>
    <header>
        <span>
            내 블로그에 post 만들기
        </span>
    </header>

    <div class="postBoard">
        <form accept-charset="utf-8" id="inputPost">
            <input type="hidden" id="blog_idx" name="blog_idx" value="${blog_idx}">
            <div>
                <input type="text" name="title" id="postTitle" required/>
                <button type="submit" id="postUpload">click</button>
            </div>
            <input type="text" name="content" id="postContent" required/>
        </form>
    </div>

    <footer class="comment">

    </footer>
</body>
</html>
