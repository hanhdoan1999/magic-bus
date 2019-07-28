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
import dao.DatChoDao;
import dao.TuyenDuongComplexDao;
import dto.BenDoDto;
import dto.BusDto;
import dto.DatChoDto;
import dto.TuyenDuongComplexDto;
import util.ValidationUtil;

@WebServlet(urlPatterns = "/capnhattuyen")
public class CapNhatTuyenServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	String idTuyenDuong=req.getParameter("idTuyenDuong");
    	
    	BenDoDao benDoDao=new BenDoDao(connection);
    	List<BenDoDto> busStops = benDoDao.selectAll();
    	req.setAttribute("busStops", busStops);
    	
    	BusDao busDao=new BusDao(connection);
    	List<BusDto> buss = busDao.selectAll();
    	req.setAttribute("buss", buss);
    	
    	TuyenDuongComplexDao dao=new TuyenDuongComplexDao(connection);
    	TuyenDuongComplexDto TuyenDuong=dao.selectById(idTuyenDuong);
    	req.setAttribute("TuyenDuong", TuyenDuong);
    	
    	DatChoDao dao2=new DatChoDao(connection);
    	List<DatChoDto> soluong=dao2.danhSachChoDaDatTheoIdTuyen(idTuyenDuong);
    	req.setAttribute("soluong", soluong.size());
        return "/WEB-INF/pages/CapNhatTuyen.jsp";
    }
}