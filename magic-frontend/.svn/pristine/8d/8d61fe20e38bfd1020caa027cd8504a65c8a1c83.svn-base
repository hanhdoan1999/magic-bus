<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp"%>
<html>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<!-- jQuery validate -->
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script type="text/javascript"
	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title><c:out value="${param.title_for_header_jsp}" /></title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script src="js/common.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<!-- jQuery modal -->
<link href="jquery/modal.css" rel="stylesheet" />
<script type="application/javascript" src="jquery/modal.js"></script>
</head>
<body>
	
	<div class="container-fluid">
		<div class="col-md-12">
			<div class="col-sm-3">
				<a href="search-line" style="float: right">
					<img alt="icon" src="imgs/1234.png" class="img-responsive"/>
				</a>
			</div>
			<div class="col-sm-9 pull-right">
				<c:if test="${sessionScope['idHoiVien'] != null}">
					<div class="pull-right" style="padding-top: 25px;">
					    <a href="#profile"><button><i class="fa fa-user-circle"></i><c:out value="${sessionScope['idHoiVien']}"/></button></a>
						<a href="logoutUser"><button><i class="fa fa-sign-out"></i>Đăng xuất</button></a>
						<a href="danhsachdatcho?idHoiVien=${sessionScope['idHoiVien']}"><button><i class="fa fa-list"></i>Danh
								Sách Đặt Chỗ</button></a>
					</div>
					
				</c:if>
				<c:if test="${sessionScope['idHoiVien'] == null}">
					<div class="pull-right" style="padding-top: 25px;">
						<a href="dangkihoivien"><button style="margin-right: 18px"><i class="fa fa-registered"></i>ĐĂNG KÝ</button></a>
						<a href="loginUser"><button><i class="fa fa-sign-in"></i>ĐĂNG NHẬP</button></a>
					</div>
				</c:if>				
			</div>
		</div>
	</div>
	<div id="error-message" class="text-center">
		<c:out value="${oneTimeMessage}"></c:out>
		<div id="errorArea">
			<c:forEach items="${errorMessages}" var="errorMessage">
				<c:out value="${errorMessage}" />
				<br />
			</c:forEach>
		</div>
	</div>