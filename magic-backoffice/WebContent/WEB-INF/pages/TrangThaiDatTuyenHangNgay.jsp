<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp"%>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
	<jsp:param value="Magic Bus-Trạng thái đặt tuyến hàng ngày"
		name="title_for_header_jsp" />
</jsp:include>
<style>
input[name="lamMoiTuyen"] {
	font-size: larger;
	height: 35px;
	border-radius: 10px;
	border: 2px solid red;
}

label.error {
	font-weight: 200;
	display: inline-block;
	color: red;
	width: 350px;
}
</style>
<script type="text/javascript">
	function validateLamMoiTuyen() {
		$.validator.addMethod("regex", function(value, element, regexp) {
			if (regexp.constructor != RegExp)
				regexp = new RegExp(regexp);
			else if (regexp.global)
				regexp.lastIndex = 0;
			return this.optional(element) || regexp.test(value);
		}, "Please check your input.");

		$('#lamMoiTuyen')
				.validate(
						{
							rules : {
								lamMoiTuyen : {
									required : true,
									regex : /^([0-2][0-9]|(3)[0-1])(\/)(((0)[0-9])|((1)[0-2]))(\/)\d{4}$/i,
									maxlength : 10
								},
							},
							messages : {
								lamMoiTuyen : {
									required : 'Vui lòng nhập ngày tháng.',
									regex : 'Vui lòng nhập đúng định dạng dd/mm/yyyy.',
									maxlength : 'Vui lòng nhập đúng định dạng dd/mm/yyyy.'
								},
							},

							submitHandler : function(form) {
								return true;
							}
						});
	}
</script>
<script>
	$(function() {
		$("#lamMoi").datepicker({
			dateFormat : "dd/mm/yy"
		}).val();
	});
</script>
<div class="container">
	<div style="margin-bottom: 25PX">
		<h2>Chỉ Định Ngày Tháng</h2>
		<div class="formLoc">
			<form action="lamMoiTuyen" id="lamMoiTuyen">
				<label>Ngày</label><br> <input type="text" name="lamMoiTuyen"
					placeholder="Ngày/Tháng/Năm" id="lamMoi"> <input
					type="hidden" name="idTuyenDuong"
					value="<c:out value='${param.idTuyenDuong}'/>"><br>
				<button type="submit" onclick="validateLamMoiTuyen()"
					class="btn btn-danger" role="button" style="margin-top: 7px">Làm
					mới</button>
			</form>
		</div>
	</div>
	<a href="quanlytrangchu" class="btn btn-danger" role="button"
		style="margin-bottom: 25px">TRỞ VỀ</a>
	<div style="width: 300px">
		<table class="table table-bordered" style="margin-top: 25px">

			<tr>
				<th>Ngày tháng:</th>
				<td>${date}</td>
			</tr>
			<tr>
				<th>Xuất phát:</th>
				<td>${TuyenDuong.diemXuatPhat}<c:set var="timeString"
						value="${TuyenDuong.thoiGianKhoiHanh}" /> <fmt:parseDate
						value="${timeString}" type="both" var="parsedTime"
						pattern="HH:mm:ss" /> <c:out value="${dto.diemXuatPhat}" />(<fmt:formatDate
						value="${parsedTime}" pattern="HH:mm" />)
				</td>
			</tr>

			<tr>
				<th>Điểm Đến:</th>
				<td>${TuyenDuong.diemDen}<c:set var="timeString1"
						value="${TuyenDuong.thoiGianDuKienDen}" /> <fmt:parseDate
						value="${timeString1}" type="both" var="parsedTime1"
						pattern="HH:mm:ss" /> <c:out value="${dto.diemDen}" />(<fmt:formatDate
						value="${parsedTime1}" pattern="HH:mm" />)
			</tr>
			<tr>
				<th>Phí một chỗ ngồi:</th>
				<td><fmt:formatNumber type="number" pattern="###,###"
						value="${TuyenDuong.giaCuoc}" />đ</td>
			</tr>
		</table>
	</div>

	<h4 style="margin: 25px 0">Tình Trạng đặt chỗ</h4>

	<div class="gheTrong">
		<c:forEach var="i" begin="1" end="${seatNo}">
			<c:set value="Ghế trống" var="statusChk" />
			<c:forEach items="${choDaDat}" var="datCho">
				<c:if test="${i == datCho.idGhe}">
					<c:set value="${datCho.hoTen}" var="statusChk" />
				</c:if>
			</c:forEach>
			<span class="abc"><c:out value="${statusChk}"></c:out></span>
			<c:if test="${i % soHang == 0}">
				<br>
			</c:if>
		</c:forEach>
	</div>
</div>
<style>
.abc{
	border: 1px solid red;
    line-height: 3;
    display: block;
    width: 150px;
    float: left;
    text-align: center;
}
.gheTrong{
	width: 450px;
}   
</style>
<jsp:include page="/WEB-INF/pages/common/footer.jsp" />