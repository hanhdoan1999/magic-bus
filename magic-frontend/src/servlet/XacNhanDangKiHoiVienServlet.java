package servlet;

import java.io.IOException;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.HoiVienDao;
import dto.HoiVienDto;


@WebServlet(urlPatterns = "/xacnhandangkihoivien")
public class XacNhanDangKiHoiVienServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	String id = req.getParameter("id");
		/*
		 * String name = req.getParameter("name"); int phone =
		 * Integer.parseInt(req.getParameter("phone")); String email =
		 * req.getParameter("email"); String password = req.getParameter("password");
		 * String passwordxacnhan = req.getParameter("passwordxacnhan");
		 */
        HoiVienDao dao = new  HoiVienDao(connection);
        HoiVienDto hoivien =  dao.selectById(id);
        req.setAttribute("hoivien",hoivien);
        return "/WEB-INF/pages/XacNhanDangKiHoiVien.jsp";
    }
}

