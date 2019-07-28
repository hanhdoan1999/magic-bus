<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
<jsp:param value="Magic Bus-Màn hình tình trạng đặt chỗ của hội viên" name="title_for_header_jsp"/>
</jsp:include>
<div class="container">
<div class="row">
<div class="col-sm-4">
<div style="width: 300px">
<table class="table table-bordered">
<tr><th>ID Hội Viên:</th><td>${param.idHoiVien}</td></tr>
<tr><th>Họ Tên:</th><td>${hoivien.hoTen}</td></tr>
<tr><th>Điện Thoại:</th><td>${hoivien.soDienThoai}</td></tr>
<tr><th>Email:</th><td>${hoivien.email}</td></tr>
</table>
</div>
</div>
<div class="col-sm-8">
<a style="margin-top: 110px" href="danhsachhoivien" class="btn btn-danger" role="button">Trở về </a>
</div>
</div>
<br>
<table class="table table-hover container" style="margin-bottom: 25px">
	<tr>
		<th>Ngày tháng</th>
		<th>ID Tuyến</th>
		<th>Xuất phát</th>
		<th>Điểm đến</th>
		<th>Gía cước</th>
		<th>ID Bus</th>
		<th>Tình trạng đặt tuyến theo ngày</th>
	</tr>
	<c:forEach items="${datchos}" var="dto">
	
	<tr>
		<c:set var="dateString" value="${dto.ngayThang}" />
		<fmt:parseDate value="${dateString}" type="both" var="parsedDate" pattern="yyyy-MM-dd" />
		<td><fmt:formatDate value="${parsedDate}" pattern="dd/MM/yyyy"/></td>
		
		
		<td><c:out value="${dto.idTuyenDuong}"/></td>
		<td><c:out value="${dto.xuatPhat}"/></td>
		<td><c:out value="${dto.diemDen}"/></td>
		<td><fmt:formatNumber type="number" pattern="###,###" value="${dto.cuoc}" />đ</td>
		<td><c:out value="${dto.idBus}"/></td>

		<td><a href="trang-thai-tuyen-hang-ngay-DSHV?idTuyenDuong=<c:out value="${dto.idTuyenDuong}"/>&ngayThang=<fmt:formatDate value="${parsedDate}" pattern="dd/MM/yyyy"/>">Tình trạng</a></td>
</tr>
	
	</c:forEach>
	
</table>
	
</div>	
<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>