<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
<jsp:param value="Magic Bus-Màn hình xác nhận đăng ký tuyến" name="title_for_header_jsp"/>
</jsp:include>
<style>

.formdangki{
width:460px;
height:628px;
padding: 35px;
margin: 35px 35px;
background-color:white;
-webkit-box-shadow: 0 0 20px rgba(0,0,0,.1);
box-shadow: 0 0 20px rgba(0,0,0,.1);
}
dt {
    font-size: 15px;
    font-weight: 700;
    margin-top: 15px;
}
</style>
<div class="container" style="background-image: linear-gradient( 135deg, #9f05ff69 10%, #fd5e086b 100%);margin-top: 50px" >  
   <div class="formdangki" >
  <h4 style="font-weight: bold;font-size: 22px">XÁC NHẬN ĐĂNG KÝ TUYẾN</h4>
<dl>
    
    <dt> Điểm Đi:</dt>
    <dd><c:out value="${benxuatphat}"></c:out>
    <dt> Điểm Đến:</dt>
    <dd><c:out value="${benden}"></c:out>
    <dt>Giá Cước:</dt>
    <dd><c:out value="${param.giaCuoc}"></c:out>
    <dt>ID Bus:</dt>
    <dd><c:out value="${bus}"></c:out>&nbsp;&nbsp;&nbsp;<c:out value="${bus1.soHang}"></c:out>hàng&nbsp;x&nbsp;<c:out value="${bus1.soGheMoiHang}"></c:out>
    <dt>Thời Gian Xuất Phát:</dt>
    <dd><c:out value="${param.thoiGianXuatPhat}"></c:out>
    <dt>Thời Gian Đến:</dt>
    <dd><c:out value="${param.thoiGianDen}"></c:out>
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
 <input type="hidden" name="thoiGianXuatPhat" value="<c:out value='${param.thoiGianXuatPhat}'/>">
 <input type="hidden" name="thoiGianDen" value="<c:out value='${param.thoiGianDen}'/>">
 
 <input type="hidden" name="ngayBatDauHoatDong" value="<c:out value='${param.ngayBatDauHoatDong}'/>">
 <input type="hidden" name="ngayKetThucHoatDong" value="<c:out value='${param.ngayKetThucHoatDong}'/>">
 
<button   onclick="doSubmit('frm', 'xacnhandangkituyenthanhcong')" class="btn btn-success">OK</button>
<button   onclick="doSubmit('frm', 'dangkituyen')" class="btn btn-danger">Trở về</button>
 
</div>
</div>
<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>