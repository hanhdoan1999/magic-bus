<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp"%>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
	<jsp:param value="Magic Bus-Màn hình cập nhật tuyến"
		name="title_for_header_jsp" />
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
	 <h2 >CẬP NHẬT TUYẾN ĐƯỜNG</h2>
		<form name="frm" method="post">

			<div class="form-group">
				<label for=""> Điểm Đi:</label> <select class="form-control"
					name="diemXuatPhat">

					<c:forEach items="${busStops}" var="diemXuatPhat">
						<option value="${diemXuatPhat.idBen}"
							<c:if test="${diemXuatPhat.tinhThanh==TuyenDuong.diemXuatPhat}">selected</c:if>><c:out
								value="${diemXuatPhat.tinhThanh}" /></option>
					</c:forEach>
				</select>
			</div>

			<div class="form-group">
				<label for=""> Điểm Đến:</label> <select class="form-control"
					name="diemDen">

					<c:forEach items="${busStops}" var="diemDen">
						<option value="${diemDen.idBen}"
							<c:if test="${diemDen.tinhThanh==TuyenDuong.diemDen}">selected</c:if>><c:out
								value="${diemDen.tinhThanh}" /></option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label for="giaCuoc">Giá Cước:</label> <input type="text"
					class="form-control" name="giaCuoc"
					value="<c:out value="${TuyenDuong.giaCuoc}"></c:out>">
			</div>
			<div class="form-group">
				<label for="">ID Bus:</label> <select class="form-control" name="bus">

					<c:forEach items="${buss}" var="bus">
						<option value="${bus.idBus}"
							<c:if test="${bus.idBus==TuyenDuong.idBus}">selected</c:if>><c:out
								value="${bus.idBus}" /></option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label for="thoiGianKhoiHanh">Thời Gian Xuất Phát:</label> <input type="text"
					class="form-control" name="thoiGianKhoiHanh"
					value="<c:out value="${TuyenDuong.thoiGianKhoiHanh}"></c:out>">
			</div>
			<div class="form-group">
					<label for="thoiGianDuKienDen">Thời Gian Đến:</label> <input type="text"
					class="form-control" name="thoiGianDuKienDen"
					value="<c:out value="${TuyenDuong.thoiGianDuKienDen}"></c:out>">
				</div>
				<div class="form-group">
					<label for="ngayBatDauHoatDong">Ngày Bắt Đầu Hoạt Động:</label> <input type="text"
					class="form-control" name="ngayBatDauHoatDong"
					value="<c:out value="${TuyenDuong.ngayBatDauHoatDong}"></c:out>">
				</div>
				<div class="form-group">
					<label for="ngayKetThucHoatDong">Ngày Kết Thúc Hoạt Động:</label> <input type="text"
					class="form-control" name="ngayKetThucHoatDong"
					value="<c:out value="${TuyenDuong.ngayKetThucHoatDong}"></c:out>">
				</div>
			<input type="hidden" name="idTuyenDuong"
				value="<c:out value='${param.idTuyenDuong}'/>">
				<c:if test="${soluong>0 }">
				<p style="color: red">Tuyến xe đã có người đặt. Hãy cẩn thận khi chỉnh sửa nó!</p>
				</c:if>

			<div class="form-group">
				<button type="submit" class="btn btn-success"
					onclick="doSubmit('frm', 'xacnhancapnhattuyen')">OK</button>

				<button type="submit" class="btn btn-danger"
					onclick="doSubmit('frm', 'danhsachtuyen')">Trở về</button>
			</div>
			</form>
</div>
</div>
		<jsp:include page="/WEB-INF/pages/common/footer.jsp" />