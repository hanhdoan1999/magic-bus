<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
<jsp:param value="Magic Bus-Màn hình đăng ký bus" name="title_for_header_jsp"/>
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
label.error {
        font-weight: 200;
        display: inline-block;
        color:red;
        width: 350px;
    }
</style>

<script type="text/javascript">
function validateFormDangKiBus()
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

    $('#formDangkiBus').validate(
    {
        rules:
        {
          soHang:
            {
                required: true,           
                regex: /^[0-9]*$/,
                maxlength: 1
            },

            soGheMoiHang:
            {
            	required: true,           
                regex: /^[0-9]*$/,
                maxlength: 2
            },

            kiHieuDiaPhuong:
            {
            	required: true,           
                regex: /^[0-9]*$/,
                maxlength: 2
            },
            bienSoDangKi:
            {
            	required: true,           
                regex: /^[a-zA-Z0-9]*$/,
                maxlength: 2
            },
            soThuTuDangKi:
            {
            	required: true,           
                regex: /^[0-9]*$/,
                minlength: 3,
                maxlength: 6
               
            },

        },
        messages: 
        {
        	soHang: 
            {
                required: 'Vui lòng nhập số hàng.',
                regex: 'Số hàng là 1 kí tự số.',
                maxlength: 'Số hàng không quá 1 kí tự.'
            },

            soGheMoiHang:
            {
            	required: 'Vui lòng nhập số ghế mỗi hàng.',
                regex: 'Số ghế mỗi hàng là kí tự số.',
                maxlength: 'Số ghế mỗi hàng không quá 2 kí tự.'
            },

            kiHieuDiaPhuong: 
            {
            	required: 'Vui lòng nhập tên khu vực.',
                regex: 'Tên khu vực là kí tự số.',
                maxlength: 'Tên khu vực không quá 2 kí tự.'   
            },
            bienSoDangKi: 
            {
            	required: 'Vui lòng nhập biển số đăng kí.',
                regex: 'Biển số đăng kí là kí tự số hoặc chữ.',
                maxlength: 'Biển số đăng kí không quá 2 kí tự.'   
            },
            soThuTuDangKi: 
            {
            	required: 'Vui lòng nhập số thứ tự đăng kí.',
                regex: 'Số thứ tự đăng kí phải là kí tự số.',
                minlength: 'Số thứ tự đăng kí ít nhất là 3 kí tự',
                maxlength: 'Số thứ tự đăng kí không quá 6 kí tự'
                 
            },

        },

        submitHandler: function (form)
        {
            return true;
        }
    });
}
    </script>
<div class="container" style="background-image: linear-gradient( 135deg, #9f05ff69 10%, #fd5e086b 100%);margin-top: 50px" >  
   <div class="formdangki" >
  <h2 >ĐĂNG KÝ BUS</h2>
<form action="xacnhandangki" id="formDangkiBus">

<div class="form-group">
      <label for="soHang">Số hàng:</label>
      <input type="text" class="form-control" id="soHang" placeholder="Số hàng" name="soHang"
				value="<c:out value='${param.soHang}'/>">
    </div>

<div class="form-group">
      <label for="soGheMoiHang">Số ghế trên 1 hàng:</label>
      <input type="text" class="form-control" id="soGheMoiHang" placeholder="Số ghế trên 1 hàng" name="soGheMoiHang"
				value="<c:out value='${param.soGheMoiHang}'/>" >
    </div>
    <div class="form-group">
      <label for="kiHieuDiaPhuong">Tên khu vực:</label>
      <input type="text" class="form-control" id="kiHieuDiaPhuong" placeholder="Tên khu vực" name="kiHieuDiaPhuong"
				value="<c:out value='${param.kiHieuDiaPhuong}'/>" >
    </div>

<div class="form-group">
      <label for="bienSoDangKi">Số phân loại:</label>
      <input type="text" class="form-control" id="bienSoDangKi" placeholder="Số phân loại" name="bienSoDangKi"
				value="<c:out value='${param.bienSoDangKi}'/>" >
    </div>
    <div class="form-group">
      <label for="soThuTuDangKi">Số thứ tự :</label>
      <input type="text" class="form-control" id="soThuTuDangKi" placeholder="Số thứ tự" name="soThuTuDangKi"
				value="<c:out value='${param.soThuTuDangKi}'/>" >
    </div>

 <div class="form-group">
 	   <button type="submit" class="btn btn-success" onclick="validateFormDangKiBus()">Đăng Ký </button>
 	   <a href="quanlytrangchu" class="btn btn-danger" role="button">Trở Về</a>
 	   
      
        </div>

	<!--  <dl>
		
	
		<dt>Số hàng</dt>
		<dd>
			<input type="text" name="soHang"
				value="<c:out value='${param.soHang}'/>" >
		</dd>
		<dt>Số ghế trên 1 hàng</dt>
		<dd>
			<input type="text" name="soGheMoiHang"
				value="<c:out value='${param.soGheMoiHang}'/>">
		</dd>
		<dt>Tên khu vực</dt>
		<dd>
			<input type="text" name="kiHieuDiaPhuong"
				value="<c:out value='${param.kiHieuDiaPhuong}'/>">
		</dd>
		<dt>Số phân loại</dt>
		<dd>
			<input type="text" name="bienSoDangKi"
				value="<c:out value='${param.bienSoDangKi}'/>">
		</dd>
		<dt>Số thứ tự</dt>
		<dd>
			<input type="text" name="soThuTuDangKi"
				value="<c:out value='${param.soThuTuDangKi}'/>">
		</dd>

	</dl>
	<input type="button" value="Đăng ký" onclick="doSubmit('frm', 'xacnhandangki')">
		<input
		type="button" value="Trở lại" onclick="doSubmit('frm', 'danhsachbus')">-->
</form> 
</div>
</div>
<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>