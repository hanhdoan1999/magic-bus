<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
<jsp:param value="Magic Bus-Màn hình danh sách hội viên" name="title_for_header_jsp"/>
</jsp:include>
<style>
.dataTables_wrapper .dataTables_paginate .paginate_button:hover{
color: white !important;
    border: 1px solid #ec0606;
    background-color: #af1111;
    background: linear-gradient(to bottom, #ec2424 0%, #d87474 100%);
}
</style>
	<!-- Page Heading -->
	<div class="container">
	<h1>Danh Sách Hội Viên</h1>


	<a href="quanlytrangchu" class="btn btn-danger" role="button">TRỞ VỀ</a>
	<!-- table table-bordered table-hover DataTales Example -->
	<div class="ta" style="margin-top: 36px">

		<table id="example" class="display table table-bordered" style="width: 100%">
			<thead>
				<tr>
					<th>ID Hội Viên</th>
					<th>Họ tên</th>
					<th>Số điện thoại</th>
					<th>Email</th>
					<th>Trạng thái</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${hoiviens}" var="dto">
					<tr>
						<td><c:out value="${dto.idHoiVien}" /></td>
						<td><c:out value="${dto.hoTen}" /></td>
						<td><c:out value="${dto.soDienThoai}" /></td>
						<td><c:out value="${dto.email}" /></td>
						<td><a href="tinh-trang-dat-cho-cua-hoi-vien?idHoiVien=<c:out value="${dto.idHoiVien}"/>" class="btn btn-danger" role="button">Trạng Thái</a></td>
					</tr>
				</c:forEach>


			</tbody>
		</table>

	</div>
	</div>

	<!--     DataTable      -->
	<script type="text/javascript"
		src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#example').DataTable();
		});
	</script>
<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>




