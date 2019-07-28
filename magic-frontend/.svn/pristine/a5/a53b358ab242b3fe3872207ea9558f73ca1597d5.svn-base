package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BusDao;
import dao.DatChoDao;
import dto.BusDto;
import dto.DatChoDto;

@WebServlet(urlPatterns="/chi-dinh-cho-ngoi")
public class ChiDinhChoNgoiServlet extends AbstractServlet{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
			throws ServletException, IOException {
		HttpSession httpSession = req.getSession();
		//String idHoiVien = httpSession.getAttribute("idHoiVien").toString();	
		if(httpSession.getAttribute("idHoiVien")== null) {			
			return "/WEB-INF/pages/LuaChonDangKiOrLogin.jsp";		
		}else {

		String ngayThang=req.getParameter("ngayThang");
		String idTuyenDuong=req.getParameter("idTuyenDuong");
		String idBus =req.getParameter("idBus");
		BusDao busDao = new BusDao(connection);
		BusDto bus = busDao.selectById(idBus);
		req.setAttribute("bus", bus);
		int seatNo = bus.getSoHang()*bus.getSoGheMoiHang();
		req.setAttribute("seatNo", seatNo);
		req.setAttribute("soGheMoiHang", bus.getSoGheMoiHang());
		
		DatChoDao dao=new DatChoDao(connection);
		List<DatChoDto> choDaDat=dao.selectChoDaDat(ngayThang,idTuyenDuong,idBus);
		req.setAttribute("choDaDat", choDaDat);
		req.setAttribute("idBus", idBus);
		return "/WEB-INF/pages/ChonGhe.jsp";
		}
	}
}
