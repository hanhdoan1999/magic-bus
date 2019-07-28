package servlet;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DatChoDao;
import dto.DatChoDto;

@WebServlet(urlPatterns="/danh-sach-cho-da-dat-theo-id-tuyen")
public  class DanhSachChoDaDatTheoIdTuyenServlet extends AbstractServlet {
	public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {      
		String idTuyenDuong=req.getParameter("idTuyenDuong");   
		DatChoDao dao2=new DatChoDao(connection);
    	List<DatChoDto> choDaDat=dao2.danhSachChoDaDatTheoIdTuyen(idTuyenDuong);
    	req.setAttribute("choDaDat", choDaDat);
		 return "/WEB-INF/pages/DanhSachChoDaDatTheoIdTuyen.jsp";
        
    }
}


