<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
<jsp:param value="Magic Bus-Màn hình danh sách chỗ đã đặt theo ID tuyến" name="title_for_header_jsp"/>
</jsp:include>
<style>
.dataTables_wrapper .dataTables_paginate .paginate_button:hover{
color: white !important;
    border: 1px solid #ec0606;
    background-color: #af1111;
    background: linear-gradient(to bottom, #ec2424 0%, #d87474 100%);
}    
</style>
<div class="container">
<h3>Danh Sách Chỗ Đã Đặt<span style="color: red"> (ID Tuyến:<c:out value="${param.idTuyenDuong}"/>)</span> </h3>
<a href="xoatuyen?idTuyenDuong=<c:out value="${param.idTuyenDuong}"/>" class="btn btn-info" role="button" style="margin-bottom: 25px">TRỞ VỀ</a>
<table class="table table-hover container" style="background-color:white;margin-top: 50px" id="table3">
<thead>
	<tr>
	    <th>ID Tuyến Đường</th>		
		<th>Ngày Tháng</th>
		<th>ID Người Đặt</th>
		<th>Số Ghế</th>
		
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${choDaDat}" var="dto">	
	<tr>
	    <td><c:out value="${dto.idTuyenDuong}"/></td>
	    <c:set var="dateString" value="${dto.ngayThang}" />
        <fmt:parseDate value="${dateString}" type="both" var="parsedDate" pattern="yyyy-MM-dd" />
        <td><fmt:formatDate value="${parsedDate}" pattern="dd/MM/yyyy"/></td>		
		<td><c:out value="${dto.idHoiVien}"/></td>
		<td><c:out value="${dto.idGhe}"/></td>
		
	</tr>	
	</c:forEach>
	</tbody>
</table>
</div>
<!--     DataTable      -->
	<script type="text/javascript"
		src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#table3').DataTable();
		});
	</script>
<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>