package servlet;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BenDoDao;
import dao.BusDao;
import dto.BenDoDto;
import dto.BusDto;


@WebServlet(urlPatterns = "/dangkituyen")
public class DangKiTuyenServlet extends AbstractServlet {
	
   @Override
   public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
           throws ServletException, IOException {

		    BusDao busDao = new BusDao(connection);
		       List<BusDto> buss = busDao.selectAll();
		       BenDoDao dao=new BenDoDao(connection);      
		       List<BenDoDto> bendos = dao.selectAll();       
		       req.setAttribute("buss", buss);
		       req.setAttribute("bendos", bendos);
	       
	       return "/WEB-INF/pages/DangKiTuyen.jsp";
   }
}