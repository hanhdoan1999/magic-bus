<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header1.jsp">
<jsp:param value="Magic Bus-Màn hình danh sách đặt chỗ" name="title_for_header_jsp"/>
</jsp:include>
<style>
/*--------table-------------*/ 
h1{
margin-top: 50px
}
thead {
font-family: -webkit-body;
background-color: #f59e4f;
color: white;
}
body{
background-color: antiquewhite;
}
</style>
<!-- Page Heading -->
<div class="container" >
<h1>DANH SÁCH ĐẶT CHỖ</h1>
<a href="search-line" class="btn btn-danger" role="button">TRỞ VỀ</a>
<c:choose>
  <c:when test="${soluongcho==0}">
    <h3 style="color:red ">Bạn Chưa Đặt Chỗ!</h3>
  </c:when>
  <c:otherwise>
    <table class="table table-hover container" style="background-color:white;margin-top: 50px">
<thead>
	<tr>
		<th>Ngày tháng</th>
		<th>Xuất phát</th>
		<th>Điểm đến</th>
		<th>Số ghế </th>
		<th>Cước</th>
		<th>Hủy đặt chỗ</th>
	</tr>
</thead>
	<tbody>
	<c:forEach items="${danhsach}" var="dto">
	<tr>
	<c:set var="dateString" value="${dto.ngayThang}" />
		<fmt:parseDate value="${dateString}" type="both" var="parsedDate" pattern="yyyy-MM-dd" />
		<td><fmt:formatDate value="${parsedDate}" pattern="dd/MM/yyyy"/></td>
		
		<td><c:out value="${dto.xuatPhat}"/></td>
		<td><c:out value="${dto.diemDen}"/></td>
		<td><c:out value="${dto.soGhe}"/></td>
		<td><fmt:formatNumber type="number" pattern="###,###" value="${dto.cuoc}" />đ</td>
		<td><a href="huydatcho?idDatCho=<c:out value="${dto.idDatCho}"/>" class="btn btn-danger" role="button">Hủy</a></td>
	    
	</tr>
	</c:forEach>
	</tbody>
</table>
  </c:otherwise>
</c:choose>
</div>
<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>