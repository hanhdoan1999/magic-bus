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
import dao.HoiVienDao;
import dto.HoiVienDto;

@WebServlet(urlPatterns = "/dangkihoivienthanhcong")
public class DangKiHoiVienThanhCongServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	HoiVienDto dto = new HoiVienDto();
        dto.setIdHoiVien(req.getParameter("idHoiVien"));
        dto.setHoTen(req.getParameter("hoTen"));
        dto.setSoDienThoai(Integer.parseInt(req.getParameter("soDienThoai")));
        dto.setEmail(req.getParameter("email"));
        dto.setMatKhau(req.getParameter("matKhau"));
        HoiVienDto hoivien = null;
        HoiVienDao dao = new HoiVienDao(connection);
        hoivien= dao.selectById(req.getParameter("idHoiVien"));
        if (hoivien == null) {
            dao.insert(dto);
            HttpSession session = req.getSession();
            session.setAttribute("oneTimeMessage", "Bạn đã đăng kí thành công!!!");
            
            return "/WEB-INF/pages/DangKiThanhCong.jsp";
        }else {
            List<String> errorMessages = new ArrayList<String>();
            errorMessages.add("ID hội viên đã được đăng kí.");
            req.setAttribute("errorMessages", errorMessages);
            return "dangkihoivien";
        }
    }
}
