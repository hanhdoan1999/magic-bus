<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header1.jsp">
<jsp:param value="Magic Bus-Màn hình xác nhận đăng ký hội viên" name="title_for_header_jsp"/>
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
    font-size: 18px;
    font-weight: 700;
    margin-top: 30px;
}
</style>
<div class="container" style="background-image: url('imgs/3.PNG');margin-top: 50px" >  
   <div class="formdangki" >
  <h4 style="font-weight: bold;font-size: 22px">XÁC NHẬN ĐĂNG KÝ THÀNH VIÊN</h4>
  <dl>
	<dt>ID Hội viên</dt>
   <dd><c:out value="${param.idHoiVien}"></c:out>
   <dt>Họ tên</dt>
   <dd><c:out value="${param.name}"></c:out>
   <dt>Mật khẩu</dt>
   <dd><c:out value="${param.password}"></c:out>
   <dt>Điện thoại</dt>
   <dd><c:out value="${param.phone}"></c:out>
   <dt>Địa chỉ email</dt>
   <dd><c:out value="${param.email}"></c:out>
   
 </dl>
 <form name="frm" method="post">
<input type="hidden" name="idHoiVien" value="<c:out value='${param.idHoiVien}'/>">
<input type="hidden" name="hoTen" value="<c:out value='${param.name}'/>">
<input type="hidden" name="soDienThoai" value="<c:out value='${param.phone}'/>">
<input type="hidden" name="email" value="<c:out value='${param.email}'/>">
<input type="hidden" name="idHoiVien" value="<c:out value='${param.id}'/>">
<input type="hidden" name="matKhau" value="<c:out value='${param.password}'/>">

<button   onclick="doSubmit('frm', 'dangkihoivienthanhcong')" class="btn btn-info">OK</button>
<button   onclick="doSubmit('frm', 'dangkihoivien')" class="btn btn-info">Trở về</button>
</form>
</div>
</div>

 


<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>