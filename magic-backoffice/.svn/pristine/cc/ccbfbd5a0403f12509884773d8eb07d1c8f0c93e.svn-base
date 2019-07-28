<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp"%>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
	<jsp:param value="Magic Bus-Màn hình cập nhật bến đỗ" name="title_for_header_jsp" />
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
		<h2>CẬP NHẬT BẾN ĐỖ</h2>
		<form name="frm" method="post">
			<div>
				<dt>ID Bến đỗ:</dt>
				<c:out value="${param.idBen}"></c:out>

				<input type="hidden" name="idBen"
					value="<c:out value='${dto.idBen}'/>">
			</div>
			<div class="form-group">
      <label for="tinhThanh">Tên bến đỗ:</label>
      <input type="text" class="form-control" id="tinhThanh"  name="tinhThanh"
				value="<c:out value='${dto.tinhThanh}'/>" >
    </div>
<c:if test="${sltuyenduong>0 }">
<p style="color: red">Có tuyến đang sử dụng bến đỗ này. Bạn không thể cập nhật nó!</p>
</c:if>

			<div class="form-group">
				<button type="submit" class="btn btn-success"
					onclick="doSubmit('frm', 'xacnhancapnhatbendo')" id="btn5">Cập nhật</button>

				<button type="submit" class="btn btn-danger"
					onclick="doSubmit('frm', 'danhsachbendo')">Trở về</button>
			</div>


		</form>
	</div>
</div>
<c:if test="${sltuyenduong>0 }">
<script>
document.getElementById("btn5").disabled=true;
</script>
</c:if>
<jsp:include page="/WEB-INF/pages/common/footer.jsp" />