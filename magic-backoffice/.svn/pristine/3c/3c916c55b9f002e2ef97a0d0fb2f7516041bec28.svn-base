<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
<jsp:param value="Magic Bus-Màn hình xác nhận xóa tuyến" name="title_for_header_jsp"/>
</jsp:include>
<style>
.formdangki{
width:460px;
padding: 35px 35px;
margin: 35px 20px;
background-color:white;
-webkit-box-shadow: 0 0 20px rgba(0,0,0,.1);
box-shadow: 0 0 20px rgba(0,0,0,.1);
}
dt {
    font-size: 15px;
    font-weight: 700;
    margin-top: 10px;
}

</style>
<div class="container"
	style="background-image: linear-gradient(135deg, #9f05ff69 10%, #fd5e086b 100%); margin-top: 50px">
	<div class="formdangki">
	 <h2 >XÓA TUYẾN ĐƯỜNG</h2>
		<form name="frm" method="post">
<dl>
	<dt>ID Tuyến:</dt>
    <dd><c:out value="${param.idTuyenDuong}"></c:out>
   <dt> Điểm Đi:</dt>
   <dd><c:out value="${TuyenDuong.diemXuatPhat}"></c:out>
   <dt> Điểm Đến:</dt>
   <dd><c:out value="${TuyenDuong.diemDen}"></c:out>
   <dt>Giá Cước:</dt>
   <dd><c:out value="${TuyenDuong.giaCuoc}"></c:out>
   <dt>ID Bus: </dt>
   <dd><c:out value="${TuyenDuong.idBus}"></c:out>
   <dt>Thời Gian Xuất Phát:</dt>
   <dd><c:out value="${TuyenDuong.thoiGianKhoiHanh}"></c:out>
   <dt>Thời Gian Đến:</dt>
   <dd><c:out value="${TuyenDuong.thoiGianDuKienDen}"></c:out>
   <dt>Ngày Bắt Đầu Hoạt Động:</dt>
   <dd><c:out value="${TuyenDuong.ngayBatDauHoatDong}"></c:out>
   <dt>Ngày Kết Thúc Hoạt Động:</dt>
   <dd><c:out value="${TuyenDuong.ngayKetThucHoatDong}"></c:out>
</dl>

 <input type="hidden" name="idTuyenDuong" value="<c:out value='${TuyenDuong.idTuyenDuong}'/>">
<c:if test="${soluong>0 }">
<p style="color: red">Tuyến xe đã có người đặt. Bạn không thể xóa nó!</p>
<span>Xem chi tiết tại đây. </span><a class="btn btn-danger" href="danh-sach-cho-da-dat-theo-id-tuyen?idTuyenDuong=<c:out value="${param.idTuyenDuong}"></c:out>">Chi tiết</a>
</c:if>
<div class="form-group">
				<button type="submit" class="btn btn-success"
					onclick="doSubmit('frm', 'xoatuyenthanhcong')" id="btn2">OK</button>
				<button type="submit" class="btn btn-danger"
					onclick="doSubmit('frm', 'danhsachtuyen')">Trở về</button>
			</div>
</form>
</div>
</div>
<c:if test="${soluong>0 }">
<script>
document.getElementById("btn2").disabled = true;
</script>
</c:if>
<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>