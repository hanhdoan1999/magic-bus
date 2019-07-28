<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
<jsp:param value="Magic Bus-Màn hình xác nhận cập nhật bến đỗ" name="title_for_header_jsp"/>
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
    <h3 >XÁC NHẬN CẬP NHẬT BẾN ĐỖ</h3>

<dl>
    <dt>ID Bến đỗ:</dt>
    <dd><c:out value="${param.idBen}"></c:out>
    <dt>Tỉnh thành:</dt>
    <dd><c:out value="${param.tinhThanh}"></c:out>
 
    
  
</dl>
<form name="frm" method="post">
 <input type="hidden" name="idBen" value="<c:out value='${param.idBen}'/>">
 <input type="hidden" name="tinhThanh" value="<c:out value='${param.tinhThanh}'/>">
 

	<button   onclick="doSubmit('frm', 'capnhatbendothanhcong')" class="btn btn-success">OK</button>
<button   onclick="doSubmit('frm', 'danhsachbendo')" class="btn btn-danger">Trở về</button>
</form>
</div>
</div>
<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>