<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">
	<link href="https://fonts.googleapis.com/css2?family=Caveat:wght@400..700&family=Dancing+Script:wght@400..700&family=East+Sea+Dokdo&family=Jua&family=Gaegu&family=Gamja+Flower&family=Pacifico&family=Single+Day&display=swap"
		  rel="stylesheet">
	<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
	<link rel="stylesheet" type="text/css" href="css/loginPage.css">
	<script src="js/loginPage.js"></script>
</head>
<body>
<header>
	<div class="logo">loginPage</div>
</header>

<main>
	<div class="mainBox">
		<form id="loginForm" method="post">
			<div class="inBox">
				<div class="id">
					<input type="text" name="id" class="id" id="inputId" placeholder="이메일, 전화번호">
				</div>
				<div class="passwd">
					<input type="password" name="passwd" class="passwd" id="inputPwd" placeholder="비밀번호">
				</div>
			</div>
			<div class="loginBox">
				<button type="submit" id="execute" class="login">로그인</button>
				<!-- addEventListener이 실행 될 때 function안에 preventDefault()되면 post 전송 막음 -->
				<!-- <script>
                    const login = document.getElementById("a");

                    login.addEventListener("click", function(e) {
                        e.preventDefault();
                    });
                </script> -->
			</div>
			<div class="wrapper">
				<div>
					<input type="checkbox" id="switch">
					<label for="switch" class="switch_label">
						<span class="onf_btn"></span>
					</label>
				</div>
				<span>로그인 유지</span>
			</div>
		</form>
	</div>
</main>
<footer>
	<div>
		<a href="/searchPwd">비밀번호 찾기</a>
		<a href="/searchId" class="footer-mid">아이디찾기</a>
		<a href="/signup" class="footer-end">회원가입</a>
	</div>
</footer>

</body>
</html>