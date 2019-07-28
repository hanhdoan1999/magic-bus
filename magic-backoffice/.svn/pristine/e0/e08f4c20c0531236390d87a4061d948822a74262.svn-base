<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
<jsp:param value="Magi Bus-Màn hình xác nhận thêm bến đỗ" name="title_for_header_jsp"/>
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
    margin-top: 20px;
}

</style>
<div class="container" style="background-image: linear-gradient( 135deg, #9f05ff69 10%, #fd5e086b 100%);margin-top: 50px" >  
   <div class="formdangki" >
    <h3>XÁC NHẬN THÊM MỚI BẾN ĐỖ</h3>
<form name="frm" method="post">
<dl>
    <dt>Tên bến đỗ:</dt>
    <dd><c:out value="${param.tinhThanh}"></c:out>
    
    
  
</dl>

 <input type="hidden" name="idBen" value="<c:out value='${param.idBen}'/>">
 <input type="hidden" name="tinhThanh" value="<c:out value='${param.tinhThanh}'/>">
 
<button   onclick="doSubmit('frm', 'themmoibendothanhcong')" class="btn btn-success">OK</button>
 <button onclick="doSubmit('frm', 'danhsachbendo')" class="btn btn-danger">Trở về</button>
 </form>
 </div>
 </div>

<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>