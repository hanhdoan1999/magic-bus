<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header1.jsp">
<jsp:param value="Magic Bus-Màn hình xác nhận hủy đặt chỗ" name="title_for_header_jsp"/>
</jsp:include>
<style>
h2{
margin-top: 50px
}

</style>
<div class="container" style="
    background-color: #fcf8e3; margin-top: 50px;margin-bottom: 50px " >
<H2>XÁC NHẬN HỦY ĐẶT CHỖ</H2>
<div style="width: 400px">
<table class="table table-bordered" style="background-color:white;margin-top: 70px">
<tr><th>Ngày tháng:</th><c:set var="dateString" value="${datcho.ngayThang}" />
		<fmt:parseDate value="${dateString}" type="both" var="parsedDate" pattern="yyyy-MM-dd" />
		<td><fmt:formatDate value="${parsedDate}" pattern="dd/MM/yyyy"/></td></tr>
<tr><th>Xuất phát:</th><td>${datcho.xuatPhat}</td></tr>
<tr><th>Điểm dến:</th><td>${datcho.diemDen}</td></tr>
<tr><th>Số ghế:</th><td>${datcho.soGhe}</td></tr>
<tr><th>Số tiền:</th><td><fmt:formatNumber type="number" pattern="###,###" value="${datcho.cuoc}" />đ</td></tr>
</table>
</div>
<p> Hủy đặt chỗ trên. Bạn có chắc không ?</p>

<form name="frm" method="post">
<input type="hidden" name="idHoiVien" value="${sessionScope['idHoiVien']}">
<input type="hidden" name="idDatCho" value="<c:out value='${datcho.idDatCho}'/>">
 <input type="hidden" name="ngayThang" value="<c:out value='${datcho.ngayThang}'/>">
<input type="hidden" name="xuatPhat" value="<c:out value='${datcho.xuatPhat}'/>">
<input type="hidden" name="diemDen" value="<c:out value='${datcho.diemDen}'/>">
<input type="hidden" name="soGhe" value='${datcho.soGhe}'>
<input type="hidden" name="cuoc" value="<c:out value='${datcho.cuoc}'/>">
<button   onclick="doSubmit('frm', 'huy-dat-cho-thanh-cong')" class="btn btn-danger">OK</button>
<button   onclick="doSubmit('frm', 'danhsachdatcho')" class="btn btn-danger">Trở về</button>	

</form>
</div>

<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>