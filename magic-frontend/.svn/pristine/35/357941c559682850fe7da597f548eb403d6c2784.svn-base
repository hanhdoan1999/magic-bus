<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header1.jsp">
<jsp:param value="Magic Bus-Màn hình xác nhận đặt chỗ" name="title_for_header_jsp"/>
</jsp:include>
<div class="container" style="margin-top: 70px">
<H2>XÁC NHẬN ĐẶT CHỖ</H2>
<div style="width: 400px">
<table class="table table-bordered">
<tr><th>Ngày tháng:</th><td>${param.ngayThang}</td></tr>
<tr><th>Điểm khởi hành:</th><td>${param.diemXuatPhat}<c:set var="timeString"
                value="${param.thoiGianKhoiHanh}" /> <fmt:parseDate
                value="${timeString}" type="both" var="parsedTime"
                pattern="HH:mm:ss" /> <c:out value="${dto.diemXuatPhat}" />(<fmt:formatDate
                value="${parsedTime}" pattern="HH:mm" />)</td></tr>
<tr><th>Điểm Đến:</th><td>${param.diemDen}<c:set var="timeString1"
                value="${param.thoiGianDuKienDen}" /> <fmt:parseDate
                value="${timeString1}" type="both" var="parsedTime1"
                pattern="HH:mm:ss" /> <c:out value="${dto.diemDen}" />(<fmt:formatDate
                value="${parsedTime1}" pattern="HH:mm" />)</td></tr>
</table>
</div>
<p style="border-bottom: 1px solid; width:200px ">Gía Mỗi Ghế:&nbsp;&nbsp;&nbsp;&nbsp;<fmt:formatNumber type="number" pattern="###,###" value="${param.giaCuoc}" />đ</p>
<div style="width: 400px">
<table class="table table-bordered">
<tr><th>Chỗ ngồi:</th><td>${seatCode}</td></tr>
</table>
</div>
<p style="border-bottom: 1px solid; width:200px ">Thành Tiền:&nbsp;&nbsp;&nbsp;&nbsp;<fmt:formatNumber type="number" pattern="###,###" value="${param.giaCuoc*soLuongGhe}" />đ</p>
<form name="frm">
<input type="hidden" name="ngayThang" value="<c:out value='${param.ngayThang}'/>">
<input type="hidden" name="idBus" value="<c:out value='${param.idBus}'/>">
<input type="hidden" name="idTuyenDuong" value="<c:out value='${param.idTuyenDuong}'/>">
<input type="hidden" name="idHoiVien" value="${sessionScope['idHoiVien']}">
<input type="hidden" name="seatCode" value="<c:out value='${seatCode}'/>">
<input type="button" value="OK" onclick="doSubmit('frm', 'dat-cho-thanh-cong')" class="btn btn-info" role="button">
<input type="button" value="Trở về" onclick="doSubmit('frm','trangchunguoidung')" class="btn btn-info" role="button"></form>
</div>
<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>