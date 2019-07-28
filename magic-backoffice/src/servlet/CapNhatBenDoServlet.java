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

import dao.BenDoDao;
import dao.TuyenDuongComplexDao;
import dto.BenDoDto;
import dto.TuyenDuongComplexDto;

@WebServlet(urlPatterns="/capnhatbendo")
public  class CapNhatBenDoServlet extends AbstractServlet {
	public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
       
		String idBen=req.getParameter("idBen");
		HttpSession session =req.getSession();
		session.setAttribute("idBen", idBen);        
		 
		 //TODO
		BenDoDao dao =new BenDoDao(connection);
		BenDoDto dto=dao.selectById(idBen);
		req.setAttribute("dto", dto);
		TuyenDuongComplexDao dao2=new TuyenDuongComplexDao(connection);
	    List<TuyenDuongComplexDto> sltuyenduong=dao2.danhSachTuyenTheoIdBen(idBen);
		req.setAttribute("sltuyenduong", sltuyenduong.size());
		 return "/WEB-INF/pages/CapNhatBenDo.jsp";
        
    }
}


