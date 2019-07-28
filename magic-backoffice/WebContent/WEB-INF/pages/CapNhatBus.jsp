<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp"%>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
	<jsp:param value="Magic Bus-Màn hình cập nhật bus" name="title_for_header_jsp" />
</jsp:include>
<style>
.formdangki {
	width: 460px;
	padding: 35px 35px;
	margin: 35px 20px;
	background-color: white;
	-webkit-box-shadow: 0 0 20px rgba(0, 0, 0, .1);
	box-shadow: 0 0 20px rgba(0, 0, 0, .1);
}
</style>
<div class="container"
	style="background-image: linear-gradient(135deg, #9f05ff69 10%, #fd5e086b 100%); margin-top: 50px">
	<div class="formdangki">
		<h2>CẬP NHẬT BUS</h2>
		<form name="frm" method="post">
			<div>
				<dt>ID Bus:</dt>
				<c:out value="${param.idBus}"></c:out>

				<input type="hidden" name="idBus"
					value="<c:out value='${dto.idBus}'/>">
			</div>

			<div class="form-group">
				<label for="soHang">Số hàng:</label> <input type="text"
					class="form-control" id="soHang" placeholder="Số hàng"
					name="soHang" value="<c:out value='${dto.soHang}'/>">
			</div>

			<div class="form-group">
				<label for="soGheMoiHang">Số ghế trên 1 hàng:</label> <input
					type="text" class="form-control" id="soGheMoiHang"
					placeholder="Số ghế trên 1 hàng" name="soGheMoiHang"
					value="<c:out value='${dto.soGheMoiHang}'/>">
			</div>
			<div class="form-group">
				<label for="kiHieuDiaPhuong">Tên khu vực:</label> <input type="text"
					class="form-control" id="kiHieuDiaPhuong" placeholder="Tên khu vực"
					name="kiHieuDiaPhuong"
					value="<c:out value='${dto.kiHieuDiaPhuong}'/>">
			</div>

			<div class="form-group">
				<label for="bienSoDangKi">Số phân loại:</label> <input type="text"
					class="form-control" id="bienSoDangKi" placeholder="Số phân loại"
					name="bienSoDangKi" value="<c:out value='${dto.bienSoDangKi}'/>">
			</div>
			<div class="form-group">
				<label for="soThuTuDangKi">Số thứ tự :</label> <input type="text"
					class="form-control" id="soThuTuDangKi" placeholder="Số thứ tự"
					name="soThuTuDangKi" value="<c:out value='${dto.soThuTuDangKi}'/>">
			</div>
			<c:if test="${tuyenduong>0}">
			<p style="color:red">Có <c:out value = "${tuyenduong}"/> tuyến đang sử dụng xe bus này. Hãy cẩn thận khi cập nhật!<p>
			</c:if>
			<div class="form-group">
				<button type="submit" class="btn btn-success"
					onclick="doSubmit('frm', 'xacnhancapnhatbus')">Cập nhật</button>

				<button type="submit" class="btn btn-danger"
					onclick="doSubmit('frm', 'danhsachbus')">Trở về</button>
			</div>


		</form>
	</div>
</div>
<jsp:include page="/WEB-INF/pages/common/footer.jsp" />