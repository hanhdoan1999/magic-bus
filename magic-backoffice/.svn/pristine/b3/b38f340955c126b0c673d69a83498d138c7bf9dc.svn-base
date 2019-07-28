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
import dao.TuyenDuongDao;
import dto.TuyenDuongDto;

@WebServlet(urlPatterns = "/capnhattuyenthanhcong")
public class CapNhatTuyenThanhCongServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	TuyenDuongDto dto = new TuyenDuongDto();
        dto.setIdTuyenDuong(req.getParameter("idTuyenDuong"));
        dto.setIdDiemDi(req.getParameter("diemXuatPhat"));
        dto.setIdDiemDen(req.getParameter("diemDen"));
        dto.setGiaCuoc(Integer.parseInt(req.getParameter("giaCuoc")));
        dto.setIdBus(req.getParameter("bus"));
        dto.setNgayBatDauHoatDong(req.getParameter("ngayBatDauHoatDong"));
        dto.setNgayKetThucHoatDong(req.getParameter("ngayKetThucHoatDong"));
        dto.setThoiGianXuatPhat(req.getParameter("thoiGianXuatPhat"));
        dto.setThoiGianDen(req.getParameter("thoiGianDen"));
        
        System.out.println(dto.getThoiGianXuatPhat());
        System.out.println(dto.getThoiGianDen());
        
        TuyenDuongDao dao = new TuyenDuongDao(connection);
        dao.updateTuyenDuong(dto);
        HttpSession session = req.getSession();
        session.setAttribute("oneTimeMessage", "Một tuyến đường đã được cập nhật");
        return "redirect:danhsachtuyen";
    }
}