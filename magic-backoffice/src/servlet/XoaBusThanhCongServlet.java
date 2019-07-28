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

@WebServlet(urlPatterns = "/xoabusthanhcong")
public class XoaBusThanhCongServlet extends AbstractServlet {
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
        BusDao dao = new BusDao(connection);
        dao.deleteBus(dto);
        HttpSession session = req.getSession();
        session.setAttribute("oneTimeMessage", "Một bus đã được xóa.");
        return "redirect:danhsachbus";
       
    }
}