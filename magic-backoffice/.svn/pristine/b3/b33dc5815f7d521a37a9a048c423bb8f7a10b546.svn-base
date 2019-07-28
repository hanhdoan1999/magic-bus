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
import dao.BenDoDao;
import dto.BenDoDto;

@WebServlet(urlPatterns = "/capnhatbendothanhcong")
public class CapNhatBenDoThanhCongServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	BenDoDto dto = new BenDoDto();
        dto.setIdBen(req.getParameter("idBen")); 
        dto.setTinhThanh(req.getParameter("tinhThanh"));
        BenDoDto company = null;
        BenDoDao dao = new BenDoDao(connection);
        company = dao.selectById(req.getParameter("IdBen"));
        if (company == null) {
            dao.capNhatBenDo(dto);
            HttpSession session = req.getSession();
            session.setAttribute("oneTimeMessage", "Một bến đỗ đã được cập nhật.");
           
        } 
        return "redirect:danhsachbendo"; 
    }
}