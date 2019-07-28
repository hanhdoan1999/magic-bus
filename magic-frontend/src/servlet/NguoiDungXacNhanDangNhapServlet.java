package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.HoiVienDao;
import dto.HoiVienDto;


@WebServlet(urlPatterns = "/xacnhandangnhap")
public class NguoiDungXacNhanDangNhapServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	String idHoiVien = req.getParameter("idHoiVien");
    	String matKhau = req.getParameter("matKhau");
    	HoiVienDao dao = new HoiVienDao(connection);
    	HoiVienDto nguoidung=dao.searchUserLogin(idHoiVien, matKhau);
    	if(nguoidung != null) {
    	req.setAttribute("nguoidung", nguoidung);
    	HttpSession session = req.getSession();
    	session.setAttribute("idHoiVien",nguoidung.getIdHoiVien());
    	return "redirect:search-line";
    	}else {
    		return "/WEB-INF/pages/NguoiDungDangNhap.jsp";
    	}
    	}
        
    }
