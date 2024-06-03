<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link
			href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
			rel="stylesheet">
	<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
	<link rel="stylesheet"
		  href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">
	<link
			href="https://fonts.googleapis.com/css2?family=Caveat:wght@400..700&family=Dancing+Script:wght@400..700&family=East+Sea+Dokdo&family=Jua&family=Gaegu&family=Gamja+Flower&family=Pacifico&family=Single+Day&display=swap"
			rel="stylesheet">
	<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
	<script
			src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

	<link rel="stylesheet" type="text/css" href="../../css/newJoin.css">
	<script type="text/javascript" src="/js/signup.js"></script>


</head>
<body>
<form action="" method="post" enctype="multipart/form-data"
	  onsubmit="return check()">
	<div class="form-header">
		<h2>
			<b>회원 가입</b>
		</h2>
	</div>
	<div class="form-container">
		<div class="divide">
			<div class="left">
				<div class="form-group row">
					<label for="name" class="col-sm-2 col-form-label">이름</label>
					<div class="col-sm-10">
						<input type="text" name="name" id="name" class="form-control"
							   required>
					</div>
				</div>

				<div class="form-group row">
					<label for="myid" class="col-sm-2 col-form-label">아이디</label>
					<div class="col-sm-8">
						<input type="text" name="myid" id="myid" class="form-control"
							   required>
					</div>
					<div class="col-sm-2">
						<button type="button" class="btn btn-danger btn-sm"
								id="btncheckid">중복확인</button>
					</div>
				</div>

				<div class="form-group row">
					<label for="passwd" class="col-sm-2 col-form-label">비밀번호</label>
					<div class="col-sm-10">
						<input type="password" name="passwd" id="passwd"
							   class="form-control" required maxlength="8">
					</div>
				</div>

				<div class="form-group row">
					<label for="hp" class="col-sm-2 col-form-label">핸드폰</label>
					<div class="col-sm-10">
						<input type="tel" name="hp" id="hp" class="form-control" required
							   pattern="[0-9]{3}-[0-9]{4}-[0-9]{4}" placeholder="xxx-xxxx-xxxx">
					</div>
				</div>

				<div class="form-group row">
					<label for="email" class="col-sm-2 col-form-label">이메일</label>
					<div class="col-sm-10">
						<input type="email" name="email" id="email" class="form-control"
							   required>
					</div>
				</div>
			</div>
			<div class="right">
				<img src="" id="showimg" onerror="this.src='/img/noimage1.png'">
				<input type="file" class="form-control" name="file" id="file" required="required">


			</div>
		</div>
		<div class="form-group row">
			<label for="addr" class="col-sm-2 col-form-label">주소</label>
			<div class="col-sm-10">
				<input type="text" name="addr" id="addr" class="form-control"
					   required>
			</div>
		</div>

		<div class="form-group row">
			<label for="birthday" class="col-sm-2 col-form-label">생년월일</label>
			<div class="col-sm-10">
				<input type="date" name="birthday" id="birthday"
					   class="form-control" value="2024-01-01">
			</div>
		</div>

		<div class="form-footer">
			<button type="submit" class="btn btn-outline-danger"
					style="width: 100px;">회원가입</button>
			<button type="reset" class="btn btn-outline-danger"
					style="width: 100px;">초기화</button>
		</div>
	</div>
</form>


</body>
</html>