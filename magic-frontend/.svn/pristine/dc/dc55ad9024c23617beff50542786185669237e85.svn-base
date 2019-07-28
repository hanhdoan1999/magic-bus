
package servlet;

import java.io.IOException;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DanhSachDatChoDao;



@WebServlet(urlPatterns = "/huy-dat-cho-thanh-cong")
public class HuyDatChoThanhCongServlet extends AbstractServlet {
	@Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
		/*
		 * dto.setXuatPhat(req.getParameter("xuatPhat"));
		 * dto.setDiemDen(req.getParameter("diemDen"));
		 * dto.setNgayThang(req.getParameter("ngayThang"));
		 * dto.setSoGhe(req.getParameter("soGhe"));
		 * dto.setCuoc(Integer.parseInt(req.getParameter("cuoc")));
		 */
		String idHoiVien=req.getParameter("idHoiVien");
    	String idDatCho=req.getParameter("idDatCho");
        DanhSachDatChoDao dao = new DanhSachDatChoDao(connection);
        int count=   dao.deleteDatCho(idDatCho);
        HttpSession session = req.getSession();
        session.setAttribute("oneTimeMessage", "Bạn đã hủy đặt chỗ thành công!");
        return "danhsachdatcho?idHoiVien="+idHoiVien;
		
    }
}

