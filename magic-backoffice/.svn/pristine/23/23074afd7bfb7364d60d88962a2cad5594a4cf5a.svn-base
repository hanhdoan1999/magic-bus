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
import dao.BusDao;
import dto.BusDto;

@WebServlet(urlPatterns = "/capnhatbusthanhcong")
public class CapNhatBusThanhCongServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
        BusDto dto = new BusDto();
        dto.setIdBus(req.getParameter("idBus"));
        dto.setSoHang(Integer.parseInt(req.getParameter("soHang")));
        dto.setSoGheMoiHang(Integer.parseInt(req.getParameter("soGheMoiHang")));
        dto.setKiHieuDiaPhuong(req.getParameter("kiHieuDiaPhuong"));
        dto.setBienSoDangKi(req.getParameter("bienSoDangKi"));
        
        dto.setSoThuTuDangKi(Integer.parseInt(req.getParameter("soThuTuDangKi")));
        
        
        
        BusDto company = null;
        BusDao dao = new BusDao(connection);
        company = dao.selectById(req.getParameter("IdBus"));
        if (company == null) {
            dao.capNhatBus(dto);
            HttpSession session = req.getSession();
            session.setAttribute("oneTimeMessage", "Một bus đã được thêm vào.");
            return "redirect:danhsachbus";
        } else {
            List<String> errorMessages = new ArrayList<String>();
            errorMessages.add("ID bus đã được đăng ký.");
            req.setAttribute("errorMessages", errorMessages);
            return "companyInput";
        }
    }
}