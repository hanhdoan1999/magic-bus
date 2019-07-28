<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
<jsp:param value="Magic Bus-Màn hình danh sách tuyến" name="title_for_header_jsp"/>
</jsp:include>
<style>
label.error {
        font-weight: 200;
        display: inline-block;
        color:red;
        width: 350px;
    }
.dataTables_wrapper .dataTables_paginate .paginate_button:hover{
color: white !important;
    border: 1px solid #ec0606;
    background-color: #af1111;
    background: linear-gradient(to bottom, #ec2424 0%, #d87474 100%);
}    
</style>
<script type="text/javascript">
function validateLocTuyenDuong()
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

    $('#loc').validate(
    {
        rules:
        {
        	locTuyenDuong:
            {
                required: true,           
                regex: /^([0-2][0-9]|(3)[0-1])(\/)(((0)[0-9])|((1)[0-2]))(\/)\d{4}$/i ,
                maxlength: 10
            },
        },
        messages: 
        {
        	locTuyenDuong: 
            {
                required: 'Vui lòng nhập ngày tháng.',
                regex: 'Vui lòng nhập đúng định dạng dd/mm/yyyy.',
                maxlength: 'Vui lòng nhập đúng định dạng dd/mm/yyyy.'
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
    $( "#date" ).datepicker({ dateFormat: "dd/mm/yy" }).val();
  } );
  </script>
<div class="container">
<h1>DANH SÁCH TUYẾN ĐƯỜNG</h1>
<label class="error"></label>
<form class="formSerch" id="loc" action="locTuyenDuong">
<input type="text" name="locTuyenDuong" placeholder="Ngày/Tháng/Năm" id="date"><br>
<button class="btn btn-danger" onclick="validateLocTuyenDuong()" style="margin-top: 7px">Lọc</button>
</form>
<a href="dangkituyen" class="btn btn-success" role="button" style="margin-bottom: 25px">THÊM MỚI</a>
<a href="quanlytrangchu" class="btn btn-danger" role="button" style="margin-bottom: 25px">TRỞ VỀ</a>
<table class="table table-striped table-bordered"" style="margin-top: 15px" id="lineTable">
<thead>
   <tr>
       <th>ID TuyenDuong</th>
       <th>DiemDi</th>
       <th>DiemDen</th>
       <th>NgayBatDauHoatDong</th>
       <th>NgayKetThucHoatDong</th>
       <th>GiaCuoc</th>
       <th>ID Bus</th>
       <th>Cập nhật</th>
       <th>Xoá</th>
       <th>Trạng thái tuyến hằng ngày</th>
   </tr>
</thead>
<tbody>
   <c:forEach items="${TuyenDuongs}" var="dto">
   <tr>

       <td><c:out value="${dto.idTuyenDuong}"/></td>

       <c:set var="timeString" value="${dto.thoiGianKhoiHanh}" />
       <fmt:parseDate value="${timeString}" type="both" var="parsedTime" pattern="HH:mm:ss" />
       <td><c:out value="${dto.diemXuatPhat}"/>(<fmt:formatDate value="${parsedTime}" pattern="HH:mm"/>)</td>

       <c:set var="timeString1" value="${dto.thoiGianDuKienDen}" />
       <fmt:parseDate value="${timeString1}" type="both" var="parsedTime1" pattern="HH:mm:ss" />
       <td><c:out value="${dto.diemDen}"/>(<fmt:formatDate value="${parsedTime1}" pattern="HH:mm"/>)</td>

       <c:set var="dateString" value="${dto.ngayBatDauHoatDong}" />
       <fmt:parseDate value="${dateString}" type="both" var="parsedDate" pattern="yyyy-MM-dd" />
       <td><fmt:formatDate value="${parsedDate}" pattern="dd/MM/yyyy"/></td>


       <c:set var="dateString1" value="${dto.ngayKetThucHoatDong}" />
       <fmt:parseDate value="${dateString1}" type="both" var="parsedDate1" pattern="yyyy-MM-dd" />
       <td><fmt:formatDate value="${parsedDate1}" pattern="dd/MM/yyyy"/></td>


       <td><fmt:formatNumber type="number" pattern="###,###" value="${dto.giaCuoc}" />đ</td>
       <td><c:out value="${dto.idBus}"/></td>

       <td><a href="capnhattuyen?idTuyenDuong=<c:out value="${dto.idTuyenDuong}"/>" class="btn btn-success" role="button">Cập nhật </a></td>
       <td><a href="xoatuyen?idTuyenDuong=<c:out value="${dto.idTuyenDuong}"/>" class="btn btn-danger" role="button">Xoá</a></td>
       <td><a href="trang-thai-tuyen-hang-ngay?idTuyenDuong=<c:out value="${dto.idTuyenDuong}"/>" class="btn btn-info" role="button">Trạng thái</a></td>
   </tr>
   </c:forEach>
</tbody>

</table>
</div>
<!--     DataTable      -->
	<script type="text/javascript"
		src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#lineTable').DataTable();
		});
	</script>

<!--Su dung Ajax <script>
	function loc() {
		let date = $('#date').val();
		$
				.ajax({
					url : 'locTuyenDuong',
					method : 'GET',
					data : {
						date : date
					},
					success : function(responseJson) {
						if (responseJson != null) {
							$("#lineTable").find("tr:gt(0)").remove();
							var table1 = $("#lineTable");
							$
									.each(
											responseJson,
											function(key, value) {
												var rowNew = $("<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>");
												rowNew.children().eq(0).text(value['idTuyenDuong']);
												rowNew.children().eq(1).text(value['diemXuatPhat']);
												rowNew.children().eq(2).text(value['diemDen']);
												rowNew.children().eq(3).text(value['ngayBatDauHoatDong']);
												rowNew.children().eq(4).text(value['ngayKetThucHoatDong']);
												rowNew.children().eq(5).text(value['giaCuoc']);
												rowNew.children().eq(6).text(value['idBus']);
												rowNew.children().eq(7).html( "<form action='capnhattuyen' method='POST'><input type='hidden' name='idTuyenDuong' value='"+value['idTuyenDuong']+"'/><button type='submit' class='btn btn-success'>Cập Nhật</button></form>");
												rowNew.children().eq(8).html("<form action='xoatuyen' method='POST'><input type='hidden' name='idTuyenDuong' value='"+value['idTuyenDuong']+"'/><button type='submit' class='btn btn-danger'>Xóa</button></form>");
												rowNew.children().eq(9).html("<form action='trang-thai-tuyen-hang-ngay' method='POST'><input type='hidden' name='idTuyenDuong' value='"+value['idTuyenDuong']+"'/><button type='submit'class='btn btn-info '>Trạng Thái</button></form>")
												rowNew.appendTo(table1);
											});
						}

					},
					error : function(jqXHR, exception) {
						console.log('Error occured!!');
					}
				});
	}
</script> -->
<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>