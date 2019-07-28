<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
<jsp:param value="Magic Bus-Màn hình thêm bến đỗ" name="title_for_header_jsp"/>
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
</style>
<div class="container" style="background-image: linear-gradient( 135deg, #9f05ff69 10%, #fd5e086b 100%);margin-top: 50px" >  
   <div class="formdangki" >
    <h2>THÊM MỚI BẾN ĐỖ</h2>
<form name="frm" method="post">

<div class="form-group">
      <label for="tinhThanh">Tên bến đỗ:</label>
      <input type="text" class="form-control" id="tinhThanh" placeholder="Tên bến đỗ" name="tinhThanh"
				value="<c:out value='${param.tinhThanh}'/>" >
    </div>
  <button   onclick="doSubmit('frm', 'xacnhanthemmoibendo')" class="btn btn-success">OK</button>
 <button onclick="doSubmit('frm', 'danhsachbendo')" class="btn btn-danger">Trở về</button>
	<!--  <dl>
	
		<dt>Tên bến đỗ</dt>
		<dd>
			<input type="text" name="tinhThanh"
				value="<c:out value='${param.tinhThanh}'/>">
		
	</dl>
	<input type="button" value="OK" onclick="doSubmit('frm', 'xacnhanthemmoibendo')">-->
		
</form>
</div>
</div>
<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>