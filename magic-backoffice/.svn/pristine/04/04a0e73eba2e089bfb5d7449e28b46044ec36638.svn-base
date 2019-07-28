package servlet;
import java.io.IOException;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BusDao;
import dao.DatChoDao;
import dao.TuyenDuongComplexDao;
import dto.BusDto;
import dto.DatChoDto;
import dto.TuyenDuongComplexDto;


@WebServlet(urlPatterns = "/lamMoiTuyen")
public class lamMoiTuyenServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	  String date=req.getParameter("lamMoiTuyen");
    	  String idTuyenDuong=req.getParameter("idTuyenDuong");
          TuyenDuongComplexDao dao=new TuyenDuongComplexDao(connection);
          TuyenDuongComplexDto TuyenDuong=dao.selectById(idTuyenDuong);
          req.setAttribute("TuyenDuong", TuyenDuong);
          req.setAttribute("date", date);         
          String idBus=TuyenDuong.getIdBus();
          BusDao busDao = new BusDao(connection);
          BusDto bus = busDao.selectById(idBus);
  		  req.setAttribute("bus", bus);
  		  int seatNo = bus.getSoHang()*bus.getSoGheMoiHang();
  		  req.setAttribute("seatNo", seatNo);
  		  req.setAttribute("soHang", bus.getSoHang());
  		  req.setAttribute("soGheMoiHang", bus.getSoGheMoiHang());
  		
  		
  		DatChoDao dao1=new DatChoDao(connection);
  		List<DatChoDto> choDaDat=dao1.selectChoDaDat(date,idTuyenDuong,idBus);
  		req.setAttribute("choDaDat", choDaDat);
		/* return "/WEB-INF/pages/LamMoiTuyen.jsp"; */
		return "/WEB-INF/pages/TrangThaiDatTuyenHangNgay.jsp";
    }

}