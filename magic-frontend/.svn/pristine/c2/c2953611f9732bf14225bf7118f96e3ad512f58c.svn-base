package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = "/loginUser")
public class DangNhapServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	
    	HttpSession session = req.getSession();    	
    	if(session.getAttribute("id_hoi_vien") != null) {
    		 return "redirect:search-line";
    	}else {
    		 return "/WEB-INF/pages/NguoiDungDangNhap.jsp";
    	}
    }
}