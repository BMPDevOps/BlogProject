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


<script src="js/newBlog.js"></script>

<body>
<form id="blogSave">
    <div class="form-header">
        <h2>
            <b>블로그 만들기</b>
        </h2>
    </div>
        <div class="form-group row">
            <label for="blogName" class="col-sm-2 col-form-label">블로그 이름</label>
            <div class="col-sm-10">
                <input type="text" name="blog_name" id="blogName" class="form-control" required>
            </div>
        </div>

        <div class="form-footer">
            <button type="submit" class="btn btn-outline-danger"
                    style="width: 100px;">만들기</button>
            <button type="reset" class="btn btn-outline-danger"
                    style="width: 100px;">초기화</button>
        </div>
    </div>
</form>

    <div class="newBlog">
        id = sessionid
        blogName
        tilestamp
    </div>
</body>
</html>
