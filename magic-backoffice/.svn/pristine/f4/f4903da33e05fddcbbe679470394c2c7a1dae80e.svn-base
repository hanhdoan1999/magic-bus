package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.BusDao;
import dao.TuyenDuongDao;
import dto.BusDto;
import dto.TuyenDuongDto;

import util.ValidationUtil;

@WebServlet(urlPatterns = "/xoabus")
public class XacNhanXoaBusServlet extends AbstractServlet {
    private static final int TuyenDuongDto = 0;

	@Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
        String idBus= req.getParameter("idBus");
		TuyenDuongDao tuyenduongDao = new TuyenDuongDao(connection);
		List<TuyenDuongDto> tuyenduong=tuyenduongDao.danhSachTuyenTheoIdBus(idBus);
		
        BusDao dao = new BusDao(connection);
        BusDto bus = dao.selectById(idBus);
        req.setAttribute("bus", bus);
        req.setAttribute("tuyenduong", tuyenduong.size()); 
        
		/*
		 * String a=""+slTuyen; req.setAttribute("bus", bus);
		 * req.setAttribute("slTuyen", a);
		 */
        return "/WEB-INF/pages/XacNhanXoaBus.jsp";
    }
}