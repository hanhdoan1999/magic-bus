package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DatChoDao;
import dto.DatChoDto;


@WebServlet(urlPatterns = "/dat-cho-thanh-cong")
public class DatChoThanhCongServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	
    	DatChoDto dto = new DatChoDto();
    	dto.setNgayThang(req.getParameter("ngayThang"));
    	dto.setIdHoiVien(req.getParameter("idHoiVien"));
    	dto.setIdTuyenDuong(req.getParameter("idTuyenDuong"));
    	dto.setIdBus(req.getParameter("idBus"));
    	dto.setIdGhe(req.getParameter("seatCode")); 	
    	String [] a=req.getParameter("seatCode").split(",");
    	//dto.setIdGhe(a[0]);
    	DatChoDto datcho = null;
    	DatChoDao dao = new DatChoDao(connection);
        datcho= dao.selectById(req.getParameter("idDatCho"));
        if (datcho == null) {
        	for(int i=0;i<a.length;i++) {       		
            dao.insertDatCho(dto,a[i]);
        	}
            HttpSession session = req.getSession();
            session.setAttribute("oneTimeMessage", "Bạn đã đặt chỗ thành công.");
            return "redirect:search-line";
        }else {
            return "danhsachhoivien";
        }
    }
}
