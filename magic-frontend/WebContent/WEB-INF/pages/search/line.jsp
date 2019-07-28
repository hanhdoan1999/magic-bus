<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp"%>
<jsp:include page="/WEB-INF/pages/common/header1.jsp">
	<jsp:param value="Màn hình đăng ký hoi vien"
		name="title_for_header_jsp" />
</jsp:include>
<style>
.modal-window.large {
    width: 72%;
    background-color: #fff;
    box-shadow: 10px 10px 60px #555;
    vertical-align: middle;
    border-radius: 8px;
    padding: 15px 5%;
}
.abc{
height: 500px;
}
#lineTable th{
color: white;
}
#lineTable td{
color: white;
}
.h1TimKiem{
font-family: none;
letter-spacing: 1px;
margin: 10px 0 25px 0;
font-weight: 500;
font-size: xx-large;
}

</style>
<div class="container-fluid text-center" style="margin-top: 15px">
	<ul>	
		<li><a href="search-line">Tin Tức</a></li>
		<li><a href="search-line">Sự Kiện</a></li>
		<li><a href="search-line">Hướng Dẫn</a></li>
		<li><a href="search-line">Liên Hệ</a></li>
		<li><a href="search-line">Trang Chủ</a></li>		
	</ul>
</div>
<header style="background-image: url('imgs/header.jpg')">
	<div class="container">
		<div class="overlay">
			<h2>TÌM KIẾM TUYẾN ĐƯỜNG</h2>
			<div class="row">
				<div class="col-md-4 form-group">
					<input class="form-control" type="text" id="day" name="day"
						placeholder="Ngày" /> <span id="dayerr"></span>
				</div>
				<div class="col-md-4 form-group">
					<input class="form-control" type="text" id="month"
						placeholder="Tháng" /> <span id="montherr"></span>
				</div>
				<div class="col-md-4 form-group ">
					<input class="form-control" type="text" id="year"
						placeholder="Năm" /> <span id="yearerr"></span>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6 form-group">
					<select class="form-control" id="from" required>
						<option value="">Lựa chọn điểm đi</option>
						<c:forEach items="${busStops}" var="busStop">
							<option value="${busStop.idBen}">${busStop.tinhThanh}</option>
						</c:forEach>
					</select> <span id="fromerr"></span>
				</div>
				<div class="col-md-6 form-group">
					<select class="form-control" id="to" required>
						<option value="">Lựa chọn điểm đến</option>
						<c:forEach items="${busStops}" var="busStop">
							<option value="${busStop.idBen}">${busStop.tinhThanh}</option>
						</c:forEach>
					</select> <span id="toerr"></span>
				</div>
			</div>
			<button onclick="search()" id="myBtn" class="btn btn-danger" style="width: 150px; height: 40px; margin-top: 30px">SEARCH</button>
		</div>

	</div>
</header>
<br>
  <div id="result" class="modal" >
    <div class="modal-window large">  
    <span class="close" onClick="closePopup()">&times;</span>
    <h3 class="text-center h1TimKiem">KẾT QUẢ TÌM KIẾM TUYẾN ĐƯỜNG</h3>
    <div class="abc text-center" style="background-image: url('imgs/222.jpg')">
    
	<table class="table table-responsive container" id="lineTable" style="background-color: #6b5c5c82;margin-top: 10px;border-radius: 20px;border-collapse: inherit">
		<tr>
			<th>ID tuyến đường</th>
			<th>Điểm đi</th>
			<th>Điểm đến</th>
			<th>Hàng ghế</th>
			<th>Số ghế trống</th>
			<th>Giá cước</th>
			<th>Đặt chỗ</th>
		</tr>
	</table>
</div>
<div class="text-center">
<a href="#" class="fa fa-facebook"></a>
<a href="#" class="fa fa-twitter"></a>
<a href="#" class="fa fa-google"></a>
<a href="#" class="fa fa-linkedin"></a>
<a href="#" class="fa fa-youtube"></a>
<a href="#" class="fa fa-instagram"></a>
<a href="#" class="fa fa-pinterest"></a>							
</div>
</div>   
</div>

<div class="container">
	<h1 class="text-center h1TieuDe">Khám phá
		những điểm đến hàng đầu của chúng tôi</h1>
	<div class="row" style="margin-bottom: 25px">
		<div class="col-sm-12">
			<div class="hovereffect">
				<img class="img-responsive" alt="tinhThanh" src="imgs/b1.jpg">
				<div class="overlay">
					<h2>TP.Hồ CHÍ MINH</h2>
					<p>
						<a href="#">LINK HERE</a>
					</p>
				</div>
			</div>
		</div>
	</div>
	<div class="row" >
		<div class="col-sm-8">
			<div class="row" style="margin-bottom: 15px">
				<div class="col-sm-12">
					<div class="hovereffect">
						<img class="img-responsive" alt="tinhThanh" src="imgs/danang.jpg">
						<div class="overlay">
							<h2>ĐÀ NẴNG</h2>
							<p>
								<a href="#">LINK HERE</a>
							</p>
						</div>
					</div>
				</div>
			</div>
			<div class="row" style="margin-bottom: 25px">
				<div class="col-sm-6">
					<div class="hovereffect">
						<img class="img-responsive" alt="tinhThanh"  src="imgs/nhatrang.jpg">
						<div class="overlay">
							<h2>NHA TRANG</h2>
							<p>
								<a href="#">LINK HERE</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="hovereffect">
						<img class="img-responsive" alt="tinhThanh"  src="imgs/phuquoc.jpg">
						<div class="overlay">
							<h2>PHÚ QUỐC</h2>
							<p>
								<a href="#">LINK HERE</a>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-sm-4">
			<div class="hovereffect">
				<img class="img-responsive" alt="tinhThanh"  src="imgs/hanoi.jpg">
				<div class="overlay">
					<h2>HÀ NỘI</h2>
					<p>
						<a href="#">LINK HERE</a>
					</p>
				</div>
			</div>
		</div>
	</div>
	<div class="row" style="margin-bottom: 25px">
		<div class="col-sm-4">
			<div class="hovereffect">
				<img class="img-responsive" alt="tinhThanh"  src="imgs/hoian.jpg">
				<div class="overlay">
					<h2>HỘI AN</h2>
					<p>
						<a href="#">LINK HERE</a>
					</p>
				</div>
			</div>
		</div>
		<div class="col-sm-8">
			<div class="hovereffect">
				<img class="img-responsive" alt="tinhThanh"  src="imgs/dalat.jpg">
				<div class="overlay">
					<h2>ĐÀ LẠT</h2>
					<p>
						<a href="#">LINK HERE</a>
					</p>
				</div>
			</div>
		</div>
	</div>
	<div class="row" style="margin-bottom: 25px">
		<div class="col-sm-4">
			<div class="hovereffect">
				<img class="img-responsive" alt="tinhThanh"  src="imgs/hue.jpg">
				<div class="overlay">
					<h2>HUẾ</h2>
					<p>
						<a href="#">LINK HERE</a>
					</p>
				</div>
			</div>
		</div>
		<div class="col-sm-4">
			<div class="hovereffect">
				<img class="img-responsive" alt="tinhThanh"  src="imgs/vungtau.jpg">
				<div class="overlay">
					<h2>VŨNG TÀU</h2>
					<p>
						<a href="#">LINK HERE</a>
					</p>
				</div>
			</div>
		</div>
		<div class="col-sm-4">
			<div class="hovereffect">
				<img class="img-responsive" alt="tinhThanh" src="imgs/cantho.jpg">
				<div class="overlay">
					<h2>CẦN THƠ</h2>
					<p>
						<a href="#">LINK HERE</a>
					</p>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
  

	function closePopup(){
		$("#result").css('display','none');
	}
	function search() {

		let day = $('#day').val();
		let month = $('#month').val();
		let year = $('#year').val();
		let from = $('#from').val();
		let to = $('#to').val();
		let date = day + "/" + month + "/" + year;
		let d = new Date();
	    var today = new Date();
		var dd = String(today.getDate()).padStart(2, '0');
		var mm = String(today.getMonth()).padStart(2, '0'); //January is 0!
		var yyyy = today.getFullYear();
			
		var date1=new Date(year,month-1,day);
		var today1=new Date(yyyy,mm,dd);
		
		var theDate = new Date();
		var today2 = new Date(theDate);
		today2.setDate(today2.getDate() + 90);
	
		 if (day == null || day == ""||day<0||day>31) {
	         alert("Nhập vào ngày!");
	         return false;
	         }
	     else if (month == null || month == ""||month<0||month>12) {
		     alert("Nhập vào tháng!");
		     return false;
		     } 
		 else if (year == null || year == ""||year<d.getFullYear()) {
			 alert("Nhập vào năm!");
			 return false;   
		}
		 else if (from == null || from == "") {
		     alert("Vui lòng chọn điểm đi!");
		     return false;
		     }
		 else if (to == null || to == "") {
		     alert("Vui lòng chọn điểm đến!");
		     return false;
		     }
		 else if (from==to) {
		     alert("Điểm đi không thể trùng với điểm đến.");
		     return false;
		     }
		 else if (date1<today1) {
		     alert("Ngày không hợp lệ.");
		     return false;
		     }
		   else if (date1>=today2) {
		     alert("Bạn không thể đặt chỗ trước 90 ngày.");
		     return false;
		     }  
		 else{		
			$("#result").css('display','block');		
			$.ajax({
				url : 'search-result',
				method : 'GET',
				data : {
					day : day,
					month : month,
					year : year,
					from : from,
					to : to
				},
				success : function(responseJson) {
					if (responseJson != null) {
						$("#lineTable").find("tr:gt(0)").remove();
						var table1 = $("#lineTable");
						$.each(responseJson,function(key, value) {
							var rowNew = $("<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>");
							rowNew.children().eq(0).text(value['idLine']);
							rowNew.children().eq(1).text(value['diemDi']);
							rowNew.children().eq(2).text(value['diemDen']);
							rowNew.children().eq(3).text(value['hangGhe']);
							rowNew.children().eq(4).text(value['soGheTrong']);
							rowNew.children().eq(5).text(value['price']);
							if(Number(value['soGheTrong'])==0){
								rowNew.children().eq(6).text("Đã đủ chỗ.");
							}else{
								rowNew.children().eq(6).html("<form action='chi-dinh-cho-ngoi' method='POST'><input type='hidden' name='idTuyenDuong' value='"+value['idLine']+"'/><input type='hidden' name='thoiGianKhoiHanh' value='"+value['thoiGianKhoiHanh']+"'/><input type='hidden' name='thoiGianDuKienDen' value='"+value['thoiGianDuKienDen']+"'/><input type='hidden' name='idBus' value='"+value['idBus']+"'/><input type='hidden' name='diemDi' value='"+value['diemDi']+"'/><input type='hidden' name='diemDen' value='"+value['diemDen']+"'/><input type='hidden' name='price' value='"+value['price']+"'/><input type='hidden' name='idTuyenDuong' value='"+value['idLine']+"'/><input type='hidden' name='ngayThang' value='"+date+"'/><button type='submit'class='btnDatCho'>ĐẶT CHỖ</button></form>");
							}
							rowNew.appendTo(table1);							
						});
					}
	
				},
				error : function(jqXHR, exception) {
					console.log('Error occured!!');
				}					
			});
		}
	}
</script>
<jsp:include page="/WEB-INF/pages/common/footer1.jsp" />
