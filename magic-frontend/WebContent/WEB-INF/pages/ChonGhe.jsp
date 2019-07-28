<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header1.jsp">
<jsp:param value="Magic Bus-Màn hình chọn ghế" name="title_for_header_jsp"/>
</jsp:include>
<div class="container text-center" style="margin-top: 70px">
<H2 style="float:left">ĐẶT CHỖ</H2>
<form action="dat-ghe">
<div style="width: 400px">
<table class="table table-bordered">
<tr><th>Ngày tháng:</th><td>${param.ngayThang}</td></tr>
<tr><th>Điểm khởi hành:</th><td>${param.diemDi}<c:set var="timeString"
				value="${param.thoiGianKhoiHanh}" /> <fmt:parseDate
				value="${timeString}" type="both" var="parsedTime"
				pattern="HH:mm:ss" /> <c:out value="${dto.diemXuatPhat}" />(<fmt:formatDate
				value="${parsedTime}" pattern="HH:mm" />)</tr>
<tr><th>Điểm Đến:</th><td>${param.diemDen}<c:set var="timeString1"
				value="${param.thoiGianDuKienDen}" /> <fmt:parseDate
				value="${timeString1}" type="both" var="parsedTime1"
				pattern="HH:mm:ss" /> <c:out value="${dto.diemDen}" />(<fmt:formatDate
				value="${parsedTime1}" pattern="HH:mm" />)</td></tr>
</table>
</div>
<p style="border-bottom: 2px solid; width:200px;margin-top: 35px ">Gía Mỗi Ghế:&nbsp;&nbsp;&nbsp;&nbsp;<fmt:formatNumber type="number" pattern="###,###" value="${param.price}" />đ</p>
<h5 style="float: left">Chọn chỗ ngồi để đặt và nhấn nút đặt chỗ.</h5>
	<div class="seat">
		<c:forEach var="i" begin="1" end ="${seatNo}">
			<c:set value="" var="statusChk"/>
			<c:set value="" var="statusDis"/>			
			<c:set value="" var="bookedColor"/>			
			<c:forEach items="${choDaDat}" var="datCho">				
				<c:if test="${i == datCho.idGhe}">
					<c:set value="checked" var="statusChk"/>
					<c:set value="disabled" var="statusDis"/>
					<c:set value="class='chk-red'" var="bookedColor"/>
				</c:if>					
			</c:forEach>
			<div class="text-center" style="float: left">
			<div style="width: 80px;height: 80px">
			<div style="border: 1px solid #1516173d;padding: 5px 8px"><input type="checkbox" name="seatCode" id="option${i}" value="${i}" ${statusChk} ${statusDis} ${bookedColor}/>
			<label for="option${i}" style="font-weight: 100"><span ></span>Ghế ${i}</label></div>
			</div>			
			</div>
	       		<c:if test="${i % soGheMoiHang == 0}">
				<br><br><br><br>
			</c:if>
		</c:forEach>
     </div>   
 <input type="hidden" name="ngayThang" value='<c:out value="${param.ngayThang}"></c:out>'>
 <input type="hidden" name="diemXuatPhat" value='<c:out value="${param.diemDi}"></c:out>'>
 <input type="hidden" name="thoiGianKhoiHanh" value='<c:out value="${param.thoiGianKhoiHanh}"></c:out>'>
 <input type="hidden" name="diemDen" value='<c:out value="${param.diemDen}"></c:out>'>
 <input type="hidden" name="thoiGianDuKienDen" value='<c:out value="${param.thoiGianDuKienDen}"></c:out>'>
 <input type="hidden" name="idBus" value='<c:out value="${param.idBus}"></c:out>'>
 <input type="hidden" name="idTuyenDuong" value='<c:out value="${param.idTuyenDuong}"></c:out>'>
 <input type="hidden" name="giaCuoc" value='<c:out value="${param.price}"></c:out>'>
<input type="submit" value="Đặt Ghế" class="btn btn-info" role="button" style="float: left">         
</form> 
</div>   
<style type="text/css">
input[type="checkbox"] {
  display: none;
  border: none !important;
  box-shadow: none !important;
}

input[type="checkbox"] + label span {
  background: #76c2d6;
  border-radius:48px;
  width: 48px;
  height: 48px;
  display: inline-block;
  vertical-align: middle;
}
input[type="checkbox"]:checked + label span {
  background: url('imgs/person-icon (2).png');
  width: 48px;
  height: 48px;
  vertical-align: middle;
}
.seat{
   display: block;
   margin: 100px auto;
}
</style>    
<jsp:include page="/WEB-INF/pages/common/footer.jsp"/> 
