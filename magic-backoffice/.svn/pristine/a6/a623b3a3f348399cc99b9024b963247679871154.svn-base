<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
<jsp:param value="Magic Bus-Màn hình xác nhận cập nhật bus" name="title_for_header_jsp"/>
</jsp:include>
<style>
.formdangki{
width:460px;
padding: 35px 35px;
margin: 35px 35px;
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
    <h2 >XÁC NHẬN CẬP NHẬT BUS</h2>

<dl>
    <dt>ID Bus:</dt>
    <dd><c:out value="${param.idBus}"></c:out>
    <dt>Số Hàng:</dt>
    <dd><c:out value="${param.soHang}"></c:out>
    <dt>Số Ghế Mỗi Hàng:</dt>
    <dd><c:out value="${param.soGheMoiHang}"></c:out>
    <dt>Kí Hiệu Địa Phương:</dt>
    <dd><c:out value="${param.kiHieuDiaPhuong}"></c:out>
    <dt>Biển Số Đăng Ký:</dt>
    <dd><c:out value="${param.bienSoDangKi}"></c:out>
    <dt>Số Thứ Tự Đăng Ký:</dt>
    <dd><c:out value="${param.soThuTuDangKi}"></c:out>
    
    
  
</dl>
<form name="frm" method="post">
 <input type="hidden" name="idBus" value="<c:out value='${param.idBus}'/>">
 <input type="hidden" name="soHang" value="<c:out value='${param.soHang}'/>">
 <input type="hidden" name="soGheMoiHang" value="<c:out value='${param.soGheMoiHang}'/>">
 <input type="hidden" name="kiHieuDiaPhuong" value="<c:out value='${param.kiHieuDiaPhuong}'/>">
 <input type="hidden" name="bienSoDangKi" value="<c:out value='${param.bienSoDangKi}'/>">
 <input type="hidden" name="soThuTuDangKi" value="<c:out value='${param.soThuTuDangKi}'/>">
 

	<button   onclick="doSubmit('frm', 'capnhatbusthanhcong')" class="btn btn-success">OK</button>
<button   onclick="doSubmit('frm', 'danhsachbus')" class="btn btn-danger">Trở về</button>
</form>
</div>
</div>
<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>