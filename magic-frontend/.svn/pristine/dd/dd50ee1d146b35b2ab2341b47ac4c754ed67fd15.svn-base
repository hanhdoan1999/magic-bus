<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header1.jsp"> 
<jsp:param value="Magic Bus-Màn hình đăng ký hội viên" name="title_for_header_jsp"/>
</jsp:include>

<style>
.formdangki{
width:460px;
padding: 35px;
margin: 35px 35px;
background-color:white;
-webkit-box-shadow: 0 0 20px rgba(0,0,0,.1);
box-shadow: 0 0 20px rgba(0,0,0,.1);
}
label.error {
        font-weight: 200;
        display: inline-block;
        color:red;
        width: 350px;
    }
</style>
<script type="text/javascript">
function validateFormDangKiHoiVien()
{   
    $.validator.addMethod(
            "regex",
            function(value, element, regexp) 
            {
                if (regexp.constructor != RegExp)
                    regexp = new RegExp(regexp);
                else if (regexp.global)
                    regexp.lastIndex = 0;
                return this.optional(element) || regexp.test(value);
            },
            "Please check your input."
    );
    $("#formDangKiHoiVien").validate({
        rules: {
        	idHoiVien: {
                required: true,
                maxlength: 10
            },
        	name: {
                required: true,
                maxlength: 50
            },
            password: {
                required: true,
                maxlength: 20,
                minlength: 6
            },
            passwordxacnhan: {
                required: true,
                maxlength: 20,
                minlength: 6,
                equalTo: "#password"
            },
            phone: {
                required: true,
                regex: /((09|03|07|08|05)+([0-9]{8})\b)/g
            },
            email: {
                required: true,
                email: true
            }
        },
        messages: {
        	idHoiVien:  {
                required: "Vui lòng nhập tên đăng nhập.",
                maxlength: "Tên đăng nhập không quá 10 kí tự."
            },
        	name: {
                required: "Vui lòng nhập họ tên.",
                maxlength: "Họ tên không quá 50 kí tự."
            },
            password: {
                required: "Vui lòng nhập mật khẩu.",
                maxlength: "Mật khẩu không quá 20 kí tự.",
                minlength: "Mật khẩu từ 6 kí tự trở lên."
            },
            passwordxacnhan: {
                required: "Vui lòng nhập mật khẩu xác nhận.",
                maxlength: "Mật khẩu không quá 20 kí tự.",
                minlength: "Mật khẩu từ 6 kí tự trở lên.",
                equalTo: 'Mật khẩu không trùng'
            },
            phone: {
                required: "Vui lòng nhập số điện thoại.",
                regex: "Số điện thoại không hợp lệ"
            },
            email: {
                required:"Vui lòng nhập địa chỉ email.",
                email:"Vui lòng nhập địa chỉ email."
            },
        },
            submitHandler: function (form)
            {
                return true;
            }
        });
    }
</script>
<div class="container" style="background-color: #d9534f75;margin-top: 50px" >  
   <div class="formdangki" >
  <h2 >ĐĂNG KÝ THÀNH VIÊN</h2>
  <form name="f1" action="xacnhandangkihoivien" id="formDangKiHoiVien">
    <div class="form-group">
      <label for="idHoiVien">Tên Đăng Nhập:</label>
      <input type="text" class="form-control" id="idHoiVien" placeholder="id Hội viên" name="idHoiVien" >
    </div>
    <div class="form-group">
      <label for="name">Họ tên:</label>
      <input type="text" class="form-control" id="name" placeholder="Họ tên" name="name" >
    </div>
    <div class="form-group">
      <label for="password">Mật khẩu:</label>
      <input type="password" class="form-control" id="password" placeholder="Mật khẩu" name="password" >
    </div>
    <div class="form-group">
      <label for="passwordxacnhan">Mật khẩu(Xác nhận):</label>
      <input type="password" class="form-control" id="passwordxacnhan" placeholder="Mật khẩu(Xác nhận)" name="passwordxacnhan" >
    </div>
    <div class="form-group">
      <label for="phone">Điện thoại:</label>
      <input type="text" class="form-control" id="phone" placeholder="Điện thoại" name="phone" >
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Email" name="email" >
    </div>
       <div class="form-group">
 	   <button type="submit" class="btn btn-danger" onclick="validateFormDangKiHoiVien()">Đăng Ký</button>
       <a href="search-line" class="btn btn-danger" >&nbsp;&nbsp;Trở Lại&nbsp;&nbsp;</a>
        </div>
  </form>
</div>
</div>

<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>

