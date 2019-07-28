
<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header1.jsp">
<jsp:param value="Magic Bus-Màn hình người dùng đăng nhập" name="title_for_header_jsp"/>
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
<div class="container" style="background-image: url('imgs/dangnhap.jpg');margin-top: 50px" >  
   <div class="formdangki" >
  <h2 >ĐĂNG NHẬP</h2>
  <form action="xacnhandangnhap">
    <div class="form-group">
      <label for="idHoiVien">Tên Đăng Nhập:</label>
      <input type="text" class="form-control" id="idHoiVien" placeholder="id Hội viên" name="idHoiVien" required>
    </div>
    
    <div class="form-group">
      <label for="matKhau">Mật Khẩu:</label>
      <input type="password" class="form-control" id="matKhau" placeholder="Mật khẩu" name="matKhau" required>
    </div>
    
       <div class="form-group">
 	   <button type="submit" class="btn btn-danger">Đăng Nhập</button>
 	   <a href="search-line" class="btn btn-danger">Trở về</a>
      
        </div>
  </form>
</div>
</div>

<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>
