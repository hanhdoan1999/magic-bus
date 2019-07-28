package servlet;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BenDoDao;
import dto.BenDoDto;


@WebServlet(urlPatterns = "/themmoibendo")
public class ThemMoiBenDoServlet extends AbstractServlet {
   @Override
   public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
           throws ServletException, IOException {
	   
	   BenDoDao dao = new BenDoDao(connection);
       List<BenDoDto> bendos = dao.selectAll();
       req.setAttribute("bendos",bendos);
       return "/WEB-INF/pages/ThemMoiBenDo.jsp";
   }
}