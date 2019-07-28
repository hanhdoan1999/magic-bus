package servlet;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.BusDao;
import dao.TuyenDuongDao;
import dto.BusDto;
import dto.TuyenDuongDto;
@WebServlet(urlPatterns="/capnhatbus")
public  class CapNhapBusServlet extends AbstractServlet {
	public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
       
		String idBus=req.getParameter("idBus");
		HttpSession session =req.getSession();
		session.setAttribute("idBus", idBus);        
		BusDao dao =new BusDao(connection);
		BusDto dto=dao.selectById(idBus);
		TuyenDuongDao tuyenduongDao = new TuyenDuongDao(connection);
		List<TuyenDuongDto> tuyenduong=tuyenduongDao.danhSachTuyenTheoIdBus(idBus);
        req.setAttribute("tuyenduong", tuyenduong.size());  
		req.setAttribute("dto", dto);
		 return "/WEB-INF/pages/CapNhatBus.jsp";
        
    }
}


