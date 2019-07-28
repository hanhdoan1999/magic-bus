package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.TuyenDuongDao;
import dto.TuyenDuongDto;

@WebServlet(urlPatterns = "/xacnhandangkituyenthanhcong")
public class XacNhanDangKiTuyenThanhCong extends AbstractServlet {
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
			throws ServletException, IOException {
		TuyenDuongDto dto = new TuyenDuongDto();
		dto.setIdTuyenDuong(req.getParameter("idTuyenDuong"));
		dto.setIdDiemDi(req.getParameter("diemXuatPhat"));
		dto.setIdDiemDen(req.getParameter("diemDen"));
		dto.setGiaCuoc(Integer.parseInt((req.getParameter("giaCuoc"))));
		dto.setIdBus(req.getParameter("bus"));
		dto.setThoiGianXuatPhat(req.getParameter("thoiGianXuatPhat"));
		dto.setThoiGianDen(req.getParameter("thoiGianDen"));
		dto.setNgayBatDauHoatDong(req.getParameter("ngayBatDauHoatDong"));
		dto.setNgayKetThucHoatDong(req.getParameter("ngayKetThucHoatDong"));
		
		TuyenDuongDto tuyenduong = null;
		TuyenDuongDao dao = new TuyenDuongDao(connection);
		tuyenduong = dao.selectById(req.getParameter("idTuyenDuong"));
		if (tuyenduong == null) {
			dao.insert(dto);
			HttpSession session = req.getSession();
			session.setAttribute("oneTimeMessage", "Một tuyến đã được thêm vào.");
			return "redirect:danhsachtuyen";
		} else {
			List<String> errorMessages = new ArrayList<String>();
			errorMessages.add("ID tuyến đã được đăng ký.");
			req.setAttribute("errorMessages", errorMessages);
			return "quanlytrangchu";
		}
	}
}
