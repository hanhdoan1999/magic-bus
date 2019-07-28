<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
<jsp:param value="Magic Bus-Màn hình xác nhận xóa bus" name="title_for_header_jsp"/>
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
    <h2 >XÁC NHẬN XÓA BUS</h2>
<dl>
    <dt>ID Bus:</dt>
    <dd><c:out value="${param.idBus}"></c:out>
    <dt>Số Hàng:</dt>
    <dd><c:out value="${bus.soHang}"></c:out>
    <dt>Số Ghế Mỗi Hàng:</dt>
    <dd><c:out value="${bus.soGheMoiHang}"></c:out>
    <dt>Kí Hiệu Địa Phương:</dt>
    <dd><c:out value="${bus.kiHieuDiaPhuong}"></c:out>
    <dt>Biển Số Đăng Ký:</dt>
    <dd><c:out value="${bus.bienSoDangKi}"></c:out>
    <dt>Số Thứ Tự Đăng Ký:</dt>
    <dd><c:out value="${bus.soThuTuDangKi}"></c:out>    
</dl>
<c:if test="${tuyenduong>0}">
<p style="color:red">Có <c:out value = "${tuyenduong}"/> tuyến đang sử dụng xe bus này. Bạn không thể xóa nó!<p>
<span>Xem chi tiết tại đây </span><a href="hien-thi-tuyen-theo-idbus?idBus=<c:out value="${param.idBus}"></c:out>" class="btn btn-danger">Chi tiết</a>
</c:if>
<form name="frm" method="post">
 <input type="hidden" name="idBus" value="<c:out value='${param.idBus}'/>">
 <input type="hidden" name="soHang" value="<c:out value='${bus.soHang}'/>">
 <input type="hidden" name="soGheMoiHang" value="<c:out value='${bus.soGheMoiHang}'/>">
 <input type="hidden" name="kiHieuDiaPhuong" value="<c:out value='${bus.kiHieuDiaPhuong}'/>">
 <input type="hidden" name="bienSoDangKi" value="<c:out value='${bus.bienSoDangKi}'/>">
 <input type="hidden" name="soThuTuDangKi" value="<c:out value='${bus.soThuTuDangKi}'/>">

 <button   onclick="doSubmit('frm', 'xoabusthanhcong')" class="btn btn-success" id="myBtn" >OK</button>
 <button onclick="doSubmit('frm', 'danhsachbus')" class="btn btn-danger">Trở về</button>
 </form>
</div>
</div>
 <c:if test="${tuyenduong>0}">
<script type="text/javascript">
document.getElementById("myBtn").disabled = true;
</script>
</c:if>
<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>