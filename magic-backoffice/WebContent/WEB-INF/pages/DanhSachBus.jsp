<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
<jsp:param value="Magic Bus-Màn hình danh sách bus" name="title_for_header_jsp"/>
</jsp:include>
<div class="container">
<h1>Danh Sách Bus</h1>
<a href="dangkibus" class="btn btn-success" role="button">THÊM MỚI</a>
<a href="quanlytrangchu" class="btn btn-danger" role="button">TRỞ VỀ</a>
<table class="table table-hover container" style="background-color:white;margin-top: 50px">
<thead>
	<tr>
		<th>ID bus</th>
		<th>Biển số</th>
		<th>Số hàng</th>
		<th>Số ghế mỗi hàng</th>
		<th>Cập nhật</th>
		<th>Xóa</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${buss}" var="dto">
	
	<tr>
		<td><c:out value="${dto.idBus}"/></td>
		<td><c:out value="${dto.kiHieuDiaPhuong}${dto.bienSoDangKi}-${dto.soThuTuDangKi}"/></td>
		<td><c:out value="${dto.soHang}"/></td>
		<td><c:out value="${dto.soGheMoiHang}"/></td>
		<td><a href="capnhatbus?idBus=<c:out value="${dto.idBus}"/>" class="btn btn-success" role="button">Cập nhật</a></td>
		<td><a href="xoabus?idBus=<c:out value="${dto.idBus}"/>" class="btn btn-danger" role="button">Xoá</a></td>
		
		
	</tr>
	
	</c:forEach>
	</tbody>
</table>
</div>

<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>