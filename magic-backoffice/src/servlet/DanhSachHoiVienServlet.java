package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.HoiVienDao;
import dto.HoiVienDto;

@WebServlet(urlPatterns = "/danhsachhoivien")
public class DanhSachHoiVienServlet extends AbstractServlet {
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
			throws ServletException, IOException {
		HoiVienDao Dao = new HoiVienDao(connection);
		List<HoiVienDto> hoiviens = Dao.selectAll();
		req.setAttribute("hoiviens", hoiviens);
		return "/WEB-INF/pages/DanhSachHoiVien.jsp";
	}
}