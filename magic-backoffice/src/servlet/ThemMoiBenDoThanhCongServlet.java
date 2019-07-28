
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

@WebServlet(urlPatterns = "/themmoibendothanhcong")
public class ThemMoiBenDoThanhCongServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	BenDoDto dto = new BenDoDto();
        dto.setIdBen(req.getParameter("idBen"));
        dto.setTinhThanh(req.getParameter("tinhThanh"));
        
        BenDoDto bendo = null;
        BenDoDao dao = new BenDoDao(connection);
        bendo= dao.selectById(req.getParameter("idBen"));
        if (bendo == null) {
            dao.insert(dto);
            HttpSession session = req.getSession();
            session.setAttribute("oneTimeMessage", "Một Bến Đỗ Đã Được Thêm Vào.");
            return "redirect:danhsachbendo";
        }else {
            List<String> errorMessages = new ArrayList<String>();
            errorMessages.add("ID Bến Đỗ Đã Tồn Tại.");
            req.setAttribute("errorMessages", errorMessages);
            return "themmoibendo";
        }
    }
}
