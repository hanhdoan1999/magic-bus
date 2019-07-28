
<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
<jsp:param value="Magic Bus-Màn hình đăng ký tuyến" name="title_for_header_jsp"/>
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
function validateFormDangKiTuyen()
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

    $('#formDangkiTuyen').validate(
    {
        rules:
        {
        	diemXuatPhat:
            {   
        		required: true,
            },
            diemDen:
            {   
        		required: true,
            },

        	thoiGianXuatPhat:
            {   
        		required: true,
                regex: /(?:[01]\d|2[0123]):(?:[012345]\d):(?:[012345]\d)/,
                maxlength:8 
            },

            thoiGianDen:
            {
            	required: true,
                regex: /(?:[01]\d|2[0123]):(?:[012345]\d):(?:[012345]\d)/,
                maxlength:8 
            },

            giaCuoc:
            {
            	required: true,           
                regex: /^[0-9]*$/,
                maxlength: 10
            },
            ngayBatDauHoatDong:
            {
            	required: true,           
                regex: /([12]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\d|3[01]))/,
                minlength: 10
            },
            ngayKetThucHoatDong:
            {
            	required: true,           
                regex: /([12]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\d|3[01]))/,
                minlength: 10   
            },
            bus:
            {
            	required: true,  
            },

        },
        messages: 
        {
        	diemXuatPhat: 
            {
        		required:'Vui lòng chọn điểm xuất phát.' 
            },
            diemDen: 
            {
        		required:'Vui lòng chọn điểm đến.' 
            },
        	thoiGianXuatPhat: 
            {
        		required:'Vui lòng nhập thời gian xuất phát.',
                regex: 'Vui lòng nhập đúng định dạng HH:MM:SS.',
                maxlength: 'Vui lòng nhập đúng định dạng HH:MM:SS.'
            },
            thoiGianDen: 
            {
        		required:'Vui lòng nhập thời gian đến.',
                regex: 'Vui lòng nhập đúng định dạng HH:MM:SS.',
                maxlength: 'Vui lòng nhập đúng định dạng HH:MM:SS.'
            },

            giaCuoc:
            {
            	required: 'Vui lòng nhập giá cước.',
                regex: 'Gía cước là kí tự số.',
                maxlength: 'Gía cước không quá 10 kí tự.'
            },

            ngayBatDauHoatDong:
            {
            	required: 'Vui lòng nhập ngày bắt đầu hoạt động.',           
                regex: 'Vui lòng nhập đúng định dạng YYYY-MM-DD.',
                minlength:'Vui lòng nhập đúng định dạng YYYY-MM-DD.'
                
            },
            ngayKetThucHoatDong:
            {
            	required: 'Vui lòng nhập ngày kết thúc hoạt động.',        
                regex: 'Vui lòng nhập đúng định dạng YYYY-MM-DD.',
                minlength: 'Vui lòng nhập đúng định dạng YYYY-MM-DD.'  
            },
            bus:
            {
            	required: 'Vui lòng chọn xe bus.'   
            },

        },

        submitHandler: function (form)
        {
            return true;
        }
    });
}
    </script>
    
   <script>
  $( function() {
    $( "#ngayBatDauHoatDong" ).datepicker({ dateFormat: "yy-mm-dd" }).val();
    $( "#ngayKetThucHoatDong" ).datepicker({ dateFormat: "yy-mm-dd" }).val();
  } );
  </script>   
<div class="container" style="background-image: linear-gradient( 135deg, #9f05ff69 10%, #fd5e086b 100%);margin-top: 50px" >  
   <div class="formdangki" >
  <h2 >ĐĂNG KÝ TUYẾN</h2>
<form name="frm" method="post" action="xacnhandangkituyen" id="formDangkiTuyen">
<div class="form-group">
<label for="diemXuatPhat">Điểm xuất phát:</label>
					<select class="form-control" name="diemXuatPhat"  >
						<option value="">Điểm xuất phát:</option>
						<c:forEach items="${bendos}" var="diemXuatPhat" >
                   <option value="${diemXuatPhat.idBen}"
                       <c:if test="${diemXuatPhat.idBen==param.idBen}">selected</c:if>
                   ><c:out value="${diemXuatPhat.tinhThanh}"/></option>
               </c:forEach>
					</select>
				</div>
<div class="form-group">
<label for="diemDen">Điểm đến:</label>
					<select class="form-control" name="diemDen"  >
						<option value="">Điểm đến:</option>
						<c:forEach items="${bendos}" var="diemDen">
                   <option value="${diemDen.idBen}"
                       <c:if test="${diemDen.idBen==param.idBen}">selected</c:if>
                   ><c:out value="${diemDen.tinhThanh}"/></option>
               </c:forEach>
					</select>
				</div>
				
<div class="form-group">
      <label for="">Thời gian xuất phát:</label>
      <input type="text" class="form-control" id="thoiGianXuatPhat" placeholder="Thời gian xuất phát" name="thoiGianXuatPhat"  value="<c:out value='${param.thoiGianXuatPhat}'/>"  >
    </div>
    
<div class="form-group">
      <label for="">Thời gian đến:</label>
      <input type="text" class="form-control" id="thoiGianDen" placeholder="Thời gian đến" name="thoiGianDen"  value="<c:out value='${param.thoiGianDen}' />"  >
    </div>   
    
 <div class="form-group">
      <label for="">Giá cước:</label>
      <input type="text" class="form-control" id="giaCuoc" placeholder="Giá cước" name="giaCuoc"  value="<c:out value='${param.giaCuoc}' />" >
    </div> 
    
<div class="form-group">
      <label for="">Ngày bắt đầu hoạt động:</label>
      <input type="text" class="form-control" id="ngayBatDauHoatDong" placeholder="Ngày bắt đầu hoạt động" name="ngayBatDauHoatDong" value="<c:out value='${param.ngayBatDauHoatDong}' />"  >
    </div>   
          
<div class="form-group">
      <label for="">Ngày kết thúc hoạt động :</label>
      <input type="text" class="form-control" id="ngayKetThucHoatDong" placeholder="Ngày bắt đầu hoạt động" name="ngayKetThucHoatDong" value="<c:out value='${param.ngayKetThucHoatDong}' />"  >
    </div> 
    
 <div class="form-group">
<label for="">Bus:</label>
					<select class="form-control" name="bus">
						<option value="">Bus:</option>
						<c:forEach items="${buss}" var="bus">
                   <option value="${bus.idBus}"
                       <c:if test="${bus.idBus==param.idBus}">selected</c:if>
                   ><c:out value="${bus.idBus}"/></option>
               </c:forEach>
					</select>
				</div>
				<button type="submit" class="btn btn-success" onclick="validateFormDangKiTuyen()">Đăng Ký </button>	
		<button   onclick="doSubmit('frm', 'danhsachtuyen')" class="btn btn-danger">Trở về</button>		
</form>
</div>
</div>
<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>