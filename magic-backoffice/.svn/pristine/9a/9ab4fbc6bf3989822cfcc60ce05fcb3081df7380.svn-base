package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.BenDoDao;
import dao.TuyenDuongComplexDao;
import dao.TuyenDuongDao;
import dto.BenDoDto;
import dto.TuyenDuongComplexDto;
import dto.TuyenDuongDto;
import util.ValidationUtil;

@WebServlet(urlPatterns = "/xoabendo")
public class XacNhanXoaBenDoServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
        String idBen= req.getParameter("idBen");
        BenDoDao dao = new BenDoDao(connection);
        BenDoDto tinhThanh = dao.selectById(idBen);
        req.setAttribute("tinhThanh", tinhThanh);
        
        TuyenDuongComplexDao dao2=new TuyenDuongComplexDao(connection);
    	List<TuyenDuongComplexDto> sltuyenduong=dao2.danhSachTuyenTheoIdBen(idBen);
		req.setAttribute("sltuyenduong", sltuyenduong.size());
        return "/WEB-INF/pages/XacNhanXoaBenDo.jsp";
    }
}