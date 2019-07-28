<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
<jsp:param value="Magic Bus-Màn hình danh sách bến đỗ" name="title_for_header_jsp"/>
</jsp:include>
<div class="container">
<h1>DANH SÁCH BẾN ĐỖ</h1>
<a href="themmoibendo" class="btn btn-success" role="button">THÊM MỚI</a>
<a href="quanlytrangchu" class="btn btn-danger" role="button">TRỞ VỀ</a>
<div class="container">
<table class="table table-hover container" style="background-color:white;margin-top: 50px">
<thead>
	<tr>
		<th>ID Bến đỗ</th>
		<th>Tỉnh Thành</th>
		<th>Cập nhật</th>
		<th>Xóa</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${bendos}" var="dto">
	<tr>
		<td><c:out value="${dto.idBen}"/></td>
		<td><c:out value="${dto.tinhThanh}"/></td>
		<td><a href="capnhatbendo?idBen=<c:out value="${dto.idBen}"/>" class="btn btn-success" role="button">Cập nhật</a></td>
		<td><a href="xoabendo?idBen=<c:out value="${dto.idBen}"/>" class="btn btn-danger" role="button">Xoá</a></td>
	</tr>
	</c:forEach>
	</tbody>
</table>
</div>
</div>
<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>