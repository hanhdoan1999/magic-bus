package servlet;

import java.io.IOException;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/logoutAdmin")
public class DangXuatServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	HttpSession session = req.getSession(false); //Gọi session
    	session.removeAttribute("idQuanLy"); //Xóa thuộc tính trong session
    	return "/WEB-INF/pages/QuanLyDangNhap.jsp";
    	}
        
    }
