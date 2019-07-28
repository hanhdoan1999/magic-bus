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


@WebServlet(urlPatterns = "/dangkihoivien")
public class DangKiHoiVienServlet extends AbstractServlet {
   @Override
   public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
           throws ServletException, IOException {
	   
	   HoiVienDao dao = new HoiVienDao(connection);
       List<HoiVienDto> hoiviens = dao.selectAll();
       req.setAttribute("hoiviens", hoiviens);
       return "/WEB-INF/pages/DangKiHoiVien.jsp";
   }
}