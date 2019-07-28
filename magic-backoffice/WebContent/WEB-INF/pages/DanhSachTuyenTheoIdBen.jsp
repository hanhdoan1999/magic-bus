<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
<jsp:include page="/WEB-INF/pages/common/header.jsp">
<jsp:param value="Magic Bus-Màn hình danh sách tuyến theo ID bến" name="title_for_header_jsp"/>
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

<div class="container">
<h3>DANH SÁCH TUYẾN ĐƯỜNG <span style="color: red">(ID Bến: <c:out value="${param.idBen}"/>)</span></h3>
<a href="xoabendo?idBen=<c:out value="${param.idBen}"/>" class="btn btn-info" role="button" style="margin-bottom: 25px">TRỞ VỀ</a>
<table class="table table-striped table-bordered" style="margin-top: 15px" id="lineTable">
<thead>
   <tr>
       <th>ID TuyenDuong</th>
       <th>DiemDi</th>
       <th>DiemDen</th>
       <th>NgayBatDauHoatDong</th>
       <th>NgayKetThucHoatDong</th>
       <th>GiaCuoc</th>
       <th>ID Bus</th>
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
   </tr>
   </c:forEach>
</tbody>

</table>
</div>

<jsp:include page="/WEB-INF/pages/common/footer.jsp"/>