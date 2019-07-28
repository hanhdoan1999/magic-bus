package servlet;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BusDao;
import dto.BusDto;


@WebServlet(urlPatterns = "/dangkibus")
public class DangKiBus extends AbstractServlet {
   @Override
   public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
           throws ServletException, IOException {
	  BusDao busDao = new BusDao(connection);
       List<BusDto> buss = busDao.selectAll();
       req.setAttribute("buss", buss);
       return "/WEB-INF/pages/DangKiBus.jsp";
   }
}