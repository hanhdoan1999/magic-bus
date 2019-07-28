<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<html>
<head>
   <meta http-equiv="content-type" content="text/html; charset=UTF-8">
   <title><c:out value="${param.title_for_header_jsp}"/></title>
</head>
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
 <link  rel="stylesheet" type="text/css" href="css/style.css"/>
    
<!--     DataTable      -->
<link rel="stylesheet"
    href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
<script type="text/javascript"
    src="https://code.jquery.com/jquery-3.3.1.js"></script>
          
<!-- jQuery validate -->
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>   
<script type="text/javascript"
    src="js/common.js"></script>
 <!--     Fonts and icons     -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 <!--   Datepicker  -->
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  

<body>

<div class="container">
  <div class="row"> 
  <div class="col-sm-3">
  <a href="index.html"><img alt="icon" src="imgs/logo.png" style="margin-left: 0"></a>
  </div>
   <div class="col-sm-9">
   <div style="float:right;margin-top: 25px">
	<c:if test="${sessionScope['idQuanLy'] != null}">
		<a href="#" class="btn btn-default" role="button"><i class="fa fa-user-circle"></i>
		<c:out value="${sessionScope['idQuanLy']}" /></a>
		<a href="logoutAdmin" class="btn btn-danger" role="button">Đăng
			xuất</a>
	</c:if>

				</div>
   <!-- <a href="#" class="btn btn-danger btn-lg" style="float: right;margin-top: 20px;margin-right: -160px;">
          <span class="glyphicon glyphicon-user"></span> Đăng Xuất 
        </a> -->
   </div>
   </div>

   <div class="row" style="background-color:#d9534f;margin: 25px 0">
  <ul>
                   <li><a href="danhsachbus">Quản Lý Xe Bus</a></li>
                   <li><a href="danhsachtuyen">Quản Lý Tuyến</a></li>
                   <li><a href="danhsachhoivien">Quản Lý Thành Viên</a></li>
                   <li><a href="danhsachbendo">Quản Lý Bến Đỗ</a></li>
               </ul>    

  </div>
  </div>
  <div id="error-message" class="text-center">
   <c:out value="${oneTimeMessage}"></c:out>
   <div id="errorArea">
       <c:forEach items="${errorMessages}" var="errorMessage">
           <c:out value="${errorMessage}"/><br/>
       </c:forEach>
   </div>
</div>
