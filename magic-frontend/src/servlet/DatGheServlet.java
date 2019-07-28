package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/dat-ghe")
public class DatGheServlet extends AbstractServlet {
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
			throws ServletException, IOException {
		
		/*
		 * String ngayThang=req.getParameter("ngayThang"); String
		 * diemXuatPhat=req.getParameter("diemXuatPhat"); String
		 * thoiGianKhoiHanh=req.getParameter("thoiGianKhoiHanh"); String
		 * diemDen=req.getParameter("diemDen"); String
		 * thoiGianDuKienDen=req.getParameter("thoiGianDuKienDen"); String
		 * idBus=req.getParameter("idBus"); String
		 * idHoiVien=req.getParameter("idHoivien"); String
		 * idTuyenDuong=req.getParameter("idTuyenDuong"); String
		 * giaCuoc=req.getParameter("giaCuoc");
		 */
		
		String[] seatCodes = req.getParameterValues("seatCode");
		String seatCode = String.join(",", seatCodes);
		int soLuongGhe=seatCodes.length;
		/*
		 * 
		 * req.setAttribute("ngayThang", ngayThang); req.setAttribute("diemXuatPhat",
		 * diemXuatPhat); req.setAttribute("thoiGianKhoiHanh", thoiGianKhoiHanh);
		 * req.setAttribute("diemDen", diemDen); req.setAttribute("thoiGianDuKienDen",
		 * thoiGianDuKienDen); req.setAttribute("idBus", idBus);
		 * req.setAttribute("idHoiVien", idHoiVien); req.setAttribute("idTuyenDuong",
		 * idTuyenDuong); req.setAttribute("giaCuoc", giaCuoc);
		 */
		
		req.setAttribute("seatCode", seatCode);
		req.setAttribute("soLuongGhe", soLuongGhe);
		

		return "/WEB-INF/pages/XacNhanDatGhe.jsp";

	}
}
