package servlet;

import java.io.IOException;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/logoutUser")
public class DangXuatServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	HttpSession session = req.getSession(false); //Gá»�i session
    	session.removeAttribute("idHoiVien"); //XÃ³a thuá»™c tÃ­nh trong session
    	return "redirect:search-line";
    	}
        
    }
