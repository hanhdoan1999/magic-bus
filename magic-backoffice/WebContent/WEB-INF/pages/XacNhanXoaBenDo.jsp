<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
<jsp:param value="Magic Bus-Màn hình xác nhận xóa bến đỗ" name="title_for_header_jsp"/>
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
    <h2 >XÁC NHẬN XÓA BẾN ĐỖ</h2>

<dl>
    <dt>ID Bến:</dt>
    <dd><c:out value="${param.idBen}"></c:out>
    <dt>Tỉnh Thành:</dt>
    <dd><c:out value="${tinhThanh.tinhThanh}"></c:out>
  
</dl>
<c:if test="${sltuyenduong>0}">
<p style="color: red">Có tuyến đường đang sử dụng bến đỗ này. Bạn không thể xóa nó!</p>
<span>Xem chi tiết tại đây!  </span><a class="btn btn-danger" href="danh-sach-tuyen-theo-id-ben?idBen=<c:out value="${param.idBen}"/>">Chi Tiết</a>
</c:if>
<form name="frm" method="post">
 <input type="hidden" name="idBen" value="<c:out value='${param.idBen}'/>">
 <input type="hidden" name="tinhThanh" value="<c:out value='${tinhThanh.tinhThanh}'/>">
<button   onclick="doSubmit('frm', 'xoabendothanhcong')" class="btn btn-success" id="btn4">OK</button>
 <button onclick="doSubmit('frm', 'danhsachbendo')" class="btn btn-danger">Trở về</button>

 </form>
</div>
</div>
<c:if test="${sltuyenduong>0}">
<script type="text/javascript">
document.getElementById("btn4").disabled=true;
</script>
</c:if>

<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>