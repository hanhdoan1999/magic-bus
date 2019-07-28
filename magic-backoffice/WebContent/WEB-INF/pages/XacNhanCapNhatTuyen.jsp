<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
<jsp:param value="Magic Bus-Màn hình xác nhận cập nhật tuyến" name="title_for_header_jsp"/>
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
<div class="container" style="background-image: linear-gradient(135deg, #9f05ff69 10%, #fd5e086b 100%);margin-top: 50px" >
  <div class="formdangki" >
<h3 >XÁC NHẬN CẬP NHẬT TUYẾN</h3>
<dl>
    <dt>Tuyến Đường:</dt>
    <dd><c:out value="${idTuyenDuong}"></c:out>
    <dt>Điểm Đi:</dt>
    <dd><c:out value="${benxuatphat}"></c:out>
    <dt>ID Điểm Đến:</dt>
    <dd><c:out value="${benden}"></c:out>
    <dt>Giá Cước:</dt>
    <dd><c:out value="${param.giaCuoc}"></c:out>
    <dt>ID Bus: </dt>
    <dd><c:out value="${bus}"></c:out>
    <dt>Thời Gian Xuất Phát:</dt>
    <dd><c:out value="${param.thoiGianKhoiHanh}"></c:out>
    <dt>Thời Gian Đến:</dt>
    <dd><c:out value="${param.thoiGianDuKienDen}"></c:out>
    <dt>Ngày Bắt Đầu Hoạt Động:</dt>
    <dd><c:out value="${param.ngayBatDauHoatDong}"></c:out>
    <dt>Ngày Kết Thúc Hoạt Động:</dt>
    <dd><c:out value="${param.ngayKetThucHoatDong}"></c:out>
        
</dl>
<form name="frm" method="post">
  <input type="hidden" name="idTuyenDuong" value="<c:out value='${param.idTuyenDuong}'/>">
 <input type="hidden" name="diemXuatPhat" value="<c:out value='${param.diemXuatPhat}'/>">
 <input type="hidden" name="diemDen" value="<c:out value='${param.diemDen}'/>">
 <input type="hidden" name="giaCuoc" value="<c:out value='${param.giaCuoc}'/>">
 <input type="hidden" name="bus" value="<c:out value='${param.bus}'/>">
 <input type="hidden" name="thoiGianXuatPhat" value="<c:out value='${param.thoiGianKhoiHanh}'/>">
 <input type="hidden" name="thoiGianDen" value="<c:out value='${param.thoiGianDuKienDen}'/>">
 
 <input type="hidden" name="ngayBatDauHoatDong" value="<c:out value='${param.ngayBatDauHoatDong}'/>">
 <input type="hidden" name="ngayKetThucHoatDong" value="<c:out value='${param.ngayKetThucHoatDong}'/>">
 

 
 
 <div class="form-group">
				<button type="submit" class="btn btn-success"
					onclick="doSubmit('frm', 'capnhattuyenthanhcong')">OK</button>



				<button type="submit" class="btn btn-danger"
					onclick="doSubmit('frm', 'danhsachtuyen')">Trở về</button>
			</div>
 
 </form>
</div>
</div>
<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>>