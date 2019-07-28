package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.QuanLyDao;
import dto.QuanLyDto;


@WebServlet(urlPatterns = "/loginAdminConfirm")
public class XacNhanDangNhapServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	String idQuanLy = req.getParameter("idQuanLy");
    	String matKhau = req.getParameter("matKhau");
    	QuanLyDao dao = new QuanLyDao(connection);
    	QuanLyDto quanly=dao.searchAdminLogin(idQuanLy,matKhau);
    	if(quanly != null) {
    	req.setAttribute("quanly", quanly);
    	HttpSession session = req.getSession();
    	session.setAttribute("idQuanLy",quanly.getIdQuanLy());
    	return "redirect:quanlytrangchu";
    	}else {
    		return "/WEB-INF/pages/QuanLyDangNhap.jsp";
    	}
    	}
        
    }
