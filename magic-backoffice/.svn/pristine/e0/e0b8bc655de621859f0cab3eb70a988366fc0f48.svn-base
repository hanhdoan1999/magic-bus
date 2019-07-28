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
import dao.TuyenDuongDao;
import dto.BenDoDto;
import dto.BusDto;
import dto.TuyenDuongDto;
import util.ValidationUtil;

@WebServlet(urlPatterns = "/xacnhandangkituyen")
public class XacNhanDangKiTuyenServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	
        String idDiemDi= req.getParameter("diemXuatPhat");
        String idDiemDen= req.getParameter("diemDen");
        String idBus= req.getParameter("bus");

        BusDao dao = new BusDao(connection);
        BusDto bus = dao.selectById(idBus);
        
        BenDoDao dao1 = new BenDoDao(connection);
        BenDoDto benxuatphat = dao1.selectByIdBenDo(idDiemDi);
        
        BenDoDao dao2 = new BenDoDao(connection);
        BenDoDto benden = dao2.selectByIdBenDo(idDiemDen);
        
       
        req.setAttribute("bus", bus.getIdBus());
        req.setAttribute("benxuatphat", benxuatphat.getTinhThanh());
        req.setAttribute("benden", benden.getTinhThanh());
        req.setAttribute("bus1", bus);
     
        return "/WEB-INF/pages/XacNhanDangKiTuyen.jsp";
    }
}

